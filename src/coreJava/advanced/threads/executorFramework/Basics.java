package coreJava.advanced.threads.executorFramework;

import java.util.concurrent.*;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        /*
            The Java Executor Framework is designed to replace all the manual creation
            and management of threads. It has a built-in thread-pool which is basically
            a collection of multiple threads ready to use.

            Java Executor Framework has two major things of how they manage threads.
            So, there are multiple ways of creating and managing the thread-pool.

            One of them is creating thread-pool by using the newFixedThreadPool() method.
            By using this method, you basically tell the JVM or the Java Executor Framework
            to create a fixed size of thread-pool.

            Example:
            You have five different tasks which are asynchronous tasks, and you create a fixed
            size of thread-pool Executors.newFixedThreadPool(3).
            Now when you start the executor, it takes thread1 from the thread-pool and assigns
            task1. Thread-pool has 2 threads left, then task2 is assigned to thread2 and so on.

            Now all 3 threads are busy, but there are still 2 tasks remaining.
            Those tasks will be added to the task queue and whenever one of the threads becomes idle,
            the remaining task will be assigned to it.
            (Note: threads are NOT consumed — they go back to the pool and get reused for the next task.)

            The simple hierarchy of executor framework consists of three main interface levels.

            Executor -> ExecutorService -> ScheduledExecutorService

            Executor: This is a base functional interface which has only one abstract method execute().
                      The submitting thread hands off a Runnable and returns immediately.
                      No result, no lifecycle control, no feedback.

            ExecutorService: This is the one we need to use for all our production grade apps.
                             It will return a Future, which means it's designed for async operations with a lot of
                             built-in methods to see each phase of the lifecycle of each task.

            ScheduledExecutorService: This is in addition to the ExecutorService with time-based additions.
                                      Basically adding time based scheduling on top of everything ExecutorService provides.
        */
        // This is how to use the Base Executor Interface using the ThreadPoolExecutor implementation

        Runnable orderTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Processing orders... on " + Thread.currentThread().getName());
            }
        };
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10, true);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 1000, TimeUnit.MILLISECONDS, queue);

        processOrder(orderTask, executor);
        processOrder(orderTask, executor);
        processOrder(orderTask, executor);
        processOrder(orderTask, executor);
        processOrder(orderTask, executor);

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        // Simple use-case of the ExecutorService
        ExecutorService executorService = new ThreadPoolExecutor(4, 5, 2000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));

        Future<Double> future = executorService.submit(() -> processPayment(1000));
        try {
            Double re = future.get();
            System.out.println(re);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        executorService.shutdown();

        // ScheduledExecutorService examples
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(3);
        // One-shot: run the task after 2 seconds
        ScheduledFuture<?> oneShot = scheduledExecutorService.schedule(
                () -> System.out.println("Alarm!"), 2, TimeUnit.SECONDS
        );

        // Periodic: run with a gap of 2 seconds between each execution.
        ScheduledFuture<?> periodic = scheduledExecutorService.scheduleWithFixedDelay(
                () -> System.out.println("Heartbeat!"), 0, 2, TimeUnit.SECONDS
        );

        scheduledExecutorService.schedule(
                () -> {
                    periodic.cancel(false);
                    scheduledExecutorService.shutdown();
                }, 4, TimeUnit.SECONDS
        );
    }

    public static void processOrder(Runnable task, Executor executor) {
        executor.execute(task);
    }

    public static double processPayment(double amount) {
        return amount + 100;
    }
}