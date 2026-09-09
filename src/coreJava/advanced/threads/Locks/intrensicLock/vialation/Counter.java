package coreJava.advanced.threads.Locks.intrensicLock.vialation;

public class Counter {
    private int counter;

    public Counter(int counter){
        this.counter = counter;
    }

    public void increment(int counter){
        this.counter += counter;
    }

    public int getCounter(){
        return counter;
    }
}
