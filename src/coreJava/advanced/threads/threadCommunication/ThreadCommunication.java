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
                resources.produce(-1);
                resources.produce(-1);
            }
        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while (true){
                    int value = resources.consume();
                    if(value == -1) break;
                }
            }
        };

        new Thread(producer,"T1").start();
        new Thread(consumer,"T2").start();
        new Thread(consumer,"T3").start();
    }
}
