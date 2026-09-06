package coreJava.advanced.threads.threadMethods;

public class Task extends Thread{
    // This overridden method run() only contains the
    // logic of your program, but it can not start the thread
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            // Move from RUNNABLE into TIMED_WAITING
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
