package coreJava.advanced.threads.Locks.deadlocks.example2;

public class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper){
        String className = this.getClass().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is using pen " + className + " and trying to write on paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        String className = this.getClass().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " finished using paper" + className);
    }
}
