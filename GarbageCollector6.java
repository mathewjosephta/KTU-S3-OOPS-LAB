// Experiment 6
/* Write a Java program to demonstrate the use of garbage collector. */

import java.lang.ref.Cleaner;

public class GarbageCollector6 {

    // A simple class using Cleaner instead of finalize
    static class DemoObject {
        private static final Cleaner cleaner = Cleaner.create();
        private final Cleaner.Cleanable cleanable;

        // Constructor
        DemoObject() {
            System.out.println("Object created");
            // Registering a cleanup action to be called when the object is unreachable
            cleanable = cleaner.register(this, () -> System.out.println("Object is being cleaned up"));
        }

        // No finalize method needed
    }

    public static void main(String[] args) {
        // Creating objects
        DemoObject obj1 = new DemoObject();
        DemoObject obj2 = new DemoObject();

        // Nullifying references to make the objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggesting garbage collection
        System.gc();

        // Adding a delay to see if the cleaner runs (not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}

//SAMPLE OUTPUT 
/*
Object created
Object created
Object is being garbage collected
Object is being garbage collected
End of program
*/
