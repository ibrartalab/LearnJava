package coreJava.advanced.threads;

public class ThreadHello extends Thread{
    @Override
    public void run(){
        for(int i=0; i < 10000; i++){
            System.out.println("Hello!" + Thread.currentThread().getName());
        }
    }
}
