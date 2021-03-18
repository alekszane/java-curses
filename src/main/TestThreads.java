package main;

public class TestThreads {
    int counter;

    public static void main(String[] args) throws InterruptedException {
        TestThreads test = new TestThreads();
        test.doWork();
    }

    public synchronized void increment() {
        counter++;
    }
//First Thread
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
//Second Thread
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}