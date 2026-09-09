package coreJava.advanced.threads.Locks.intrensicLock.complaint;

public class Counter {
    private int counter;

    public Counter(int counter){
        this.counter = counter;
    }

    public synchronized void increment(int counter){
        this.counter += counter;
    }

    public void increment2(int counter){
        synchronized(this) {
            this.counter += counter;
        }
    }

    public int getCounter(){
        return counter;
    }
}
