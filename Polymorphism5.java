//EXPERIMENT 5

/* Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). 
Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures. (Exercise to understand polymorphis).*/


// Abstract class Shape
abstract class Shape {
    // Abstract method numberOfSides, which must be implemented by subclasses
    abstract void numberOfSides();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

// Hexagon class extending Shape
class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

// Main class to test the implementation
public class shape15 {
    public static void main(String[] args) {
        // Create instances of Rectangle, Triangle, and Hexagon
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Call the numberOfSides method for each shape
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}

//SAMPLE OUTPUT
/* 
A rectangle has 4 sides.
A triangle has 3 sides.
A hexagon has 6 sides. 
*/
