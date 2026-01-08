// Thread Creation in Java using Thread Class and Runnable Interface
//-------------------------------------------------------code with Er. uttam kumar------------------------------------//
class Example1 extends Thread {
    String threadId;
    
    Example1(String threadId) {
        this.threadId = threadId;
    }
    
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println(this.threadId + " - " + i);
        }
    }
}

class Example2 extends Thread {
    String threadId;
    
    Example2(String threadId) {
        this.threadId = threadId;
    }
    
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println(this.threadId + " - " + i);
        }
    }
}

class Demo implements Runnable {
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println(i);
        }
    }
}

class Threds {
    public static void main(String[] args) {
        // New State
        Demo d1 = new Demo();
        Example1 e1 = new Example1("Thread1");
        Example2 e2 = new Example2("Thread2");
        
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);
        Thread t3 = new Thread(d1);
        
        // Runnable
        // Runnable (First these below 3 (1-100) will run)
        t1.start();
        t2.start();
        t3.start();
        
        // Thread Class (Now these below 2 (1-100) will run)
        e1.start();
        e2.start();
    }
}