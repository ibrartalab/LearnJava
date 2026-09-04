package coreJava.advanced.threads;

public class ThreadWorld extends Thread{
    @Override
    public void run(){
        for(int i=0; i < 10000; i++){
            System.out.println("World!" + Thread.currentThread().getName());
        }
    }
}
