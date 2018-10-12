package edu.coursera.concurrent;

public class StarvationDemo extends Thread {
    private static int threadCount = 1;
    public void run()
    {
        System.out.println("Child thread ---" + this.getName() +
                " Thread execution starts and the priority is:" + this.getPriority());
        System.out.println("Child thread execution completes");
        threadCount++;
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread execution starts");

        // Thread priorities are set in a way that thread5
        // gets least priority.
        StarvationDemo thread1 = new StarvationDemo();
        thread1.setPriority(10);
        thread1.setName("1");
        StarvationDemo thread2 = new StarvationDemo();
        thread2.setPriority(9);
        thread2.setName("2");
        StarvationDemo thread3 = new StarvationDemo();
        thread3.setPriority(8);
        thread3.setName("3");
        StarvationDemo thread4 = new StarvationDemo();
        thread4.setPriority(7);
        thread4.setName("4");
        StarvationDemo thread5 = new StarvationDemo();
        thread5.setPriority(6);
        thread5.setName("5");

        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();
        thread3.start();
//        thread3.join();
        thread4.start();
//        thread4.join();

        // Here thread5 have to wait beacause of the
        // other thread. But after waiting for some
        // interval, thread5 will get the chance of
        // execution. It is known as Starvation
        thread5.start();

        System.out.println("Main thread execution completes");
    }
}

