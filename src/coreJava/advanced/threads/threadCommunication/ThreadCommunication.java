package coreJava.advanced.threads.threadCommunication;

public class ThreadCommunication {
    static void main() {
        SharedResources resources = new SharedResources();
        
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    resources.produce(i);
                }
            }
        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    resources.consume();
                }
            }
        };

        new Thread(producer,"T1").start();
        new Thread(consumer,"T2").start();
    }
}
