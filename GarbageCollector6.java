// Experiment 6
/* Write a Java program to demonstrate the use of garbage collector. */

public class GarbageCollector6 {
    
    // A simple class with a finalize method
    static class DemoObject {
        // Constructor
        DemoObject() {
            System.out.println("Object created");
        }

        // This method is called just before an object is garbage collected
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is being garbage collected");
        }
    }

    public static void main(String[] args) {
        // Creating objects
        DemoObject obj1 = new DemoObject();
        DemoObject obj2 = new DemoObject();

        // Nullifying references to make the objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Requesting JVM to call garbage collector
        System.gc();

        // Adding a delay to see the garbage collector output (not guaranteed)
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
