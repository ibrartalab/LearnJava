package coreJava.advanced.threads.threadLifecycle;

public class ThreadNice extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "RUNNING");
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "RUNNING AFTER");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
