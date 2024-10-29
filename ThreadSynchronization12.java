//EXPERIMENT 12
/*Write a Java program that shows thread synchronization.*/

class Counter {
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter c;

    public IncrementThread(Counter c) {
        this.c = c;
    }

    // Override the run method to define the thread's task
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Counter c = new Counter();

        // Create two IncrementThread instances
        IncrementThread thread1 = new IncrementThread(c);
        IncrementThread thread2 = new IncrementThread(c);

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + c.getCount());
    }
}

//SAMPLE OUTPUT
/*
Final count: 2000
*/
