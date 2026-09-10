package coreJava.advanced.threads.threadCommunication;

public class SharedResources {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while (hasData){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println(" Produced: " + value);
        // If there are multiple consumers to consume this data,
        // then notify() will create a deadlock, because you only notify
        // a single consumer to consume this data not all of them.

//        notify();

        // To avoid deadlocks we should used notifyAll()
        notifyAll();
    }

    public synchronized int consume(){
        while (!hasData){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println(" Consume: " + data);
        notify();
        return data;
    }
}
