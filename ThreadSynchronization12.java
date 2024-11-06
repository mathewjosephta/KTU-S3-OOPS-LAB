//EXPERIMENT 12
/*Write a Java program that shows thread synchronization.*/
import java.util.Random;

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

        // Generate a random number and check if it's even or odd
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
        System.out.println("Generated random number: " + randomNumber);

        // Check if the random number is even or odd
        if (randomNumber % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Exit message
        System.out.println("Exiting the program.");
    }
}


//SAMPLE OUTPUT
/*
Final count: 2000
*/
