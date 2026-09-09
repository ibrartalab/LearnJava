package coreJava.advanced.threads.Locks.intrensicLock.vialation;

public class Test {
    static void main(String[] args) {
        Counter counter = new Counter(0);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i < 1000; i++) {
                        counter.increment(1);
                    }
                }catch (Exception e){

                }
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");

        t1.start();
        t2.start();

        try{
            Thread.sleep(1000);

        }catch (Exception e){

        }

        int totalCount =  counter.getCounter();
        System.out.println(totalCount);
    }
}
