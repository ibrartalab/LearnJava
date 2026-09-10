package coreJava.advanced.threads.Locks.deadlocks.example2;

public class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen){
        String className = this.getClass().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is using paper " + className + " and trying to write on pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        String className = this.getClass().getName();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " finished using paper" + className);
    }
}
