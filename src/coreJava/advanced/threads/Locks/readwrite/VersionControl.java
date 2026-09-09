package coreJava.advanced.threads.Locks.readwrite;

public class VersionControl {
    public static void main() throws InterruptedException {
        SourceCode sourceCode = new SourceCode();

        Runnable writingCodeTask = new Runnable() {
            @Override
            public void run() {
                 for (int i = 1; i < 5; i++) {
                    System.out.println(sourceCode.pushCode("feature-" +i));
                    try{
                        Thread.sleep(50);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Runnable readingCode = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    sourceCode.getCode();
                    try{
                        Thread.sleep(40);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread t1 = new Thread(writingCodeTask,"TW-1");
        Thread t2 = new Thread(readingCode,"TR-2");
        Thread t3 = new Thread(readingCode,"TR-3");
        Thread t4 = new Thread(readingCode,"TR-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
