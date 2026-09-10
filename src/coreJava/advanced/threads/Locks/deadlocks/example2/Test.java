package coreJava.advanced.threads.Locks.deadlocks.example2;

public class Test {
    static void main() {
        Pen pen = new Pen();
        Paper paper = new Paper();

        /* So this creates a deadlock
        new Thread(() -> pen.writeWithPenAndPaper(paper)).start();
        new Thread(() -> paper.writeWithPaperAndPen(pen)).start();
        */

        // To prevent this deadlock we need to make sure
        // the thread runs in a global sequence of ordering
        new Thread(() -> pen.writeWithPenAndPaper(paper)).start();
        new Thread(() -> {
            synchronized (pen){
                paper.writeWithPaperAndPen(pen);
            }
        }).start();
    }
}
