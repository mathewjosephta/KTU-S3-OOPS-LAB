//Experiment 11
/* Write a Java program that implements a multi-threaded program which has three threads.
First thread generates a random integer every 1 second. If the value is even, second
thread computes the square of the number and prints. If the value is odd the third thread
will print the value of cube of the number. */

import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final NumberProcessor processor;

    public RandomNumberGenerator(NumberProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100); // Generate random number between 0 and 99
            System.out.println("Generated number: " + number);
            processor.processNumber(number);
            try {
                Thread.sleep(1000); // Wait for 1 second before generating the next number
            } catch (InterruptedException e) {
                System.out.println("Random number generator interrupted.");
            }
        }
    }
}

class NumberProcessor {
    public synchronized void processNumber(int number) {
        if (number % 2 == 0) {
            // If the number is even, compute its square
            SquareCalculator squareCalculator = new SquareCalculator(number);
            squareCalculator.start();
        } else {
            // If the number is odd, compute its cube
            CubeCalculator cubeCalculator = new CubeCalculator(number);
            cubeCalculator.start();
        }
    }
}

class SquareCalculator extends Thread {
    private final int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }
}

class CubeCalculator extends Thread {
    private final int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is " + cube);
    }
}

public class MultiThreadedRandomNumber {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        RandomNumberGenerator generator = new RandomNumberGenerator(processor);
        generator.start();
    }
}

//SAMPLE OUTPUT
/*
Generated number: 37
Cube of 37 is 50653
Generated number: 54
Square of 54 is 2916
Generated number: 22
Square of 22 is 484
Generated number: 89
Cube of 89 is 704969
...
*/
