//Interface:An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).we use interface keyword to create a interface in java

//Language is an interface.
// It includes abstract methods: getType() and getVersion().
interface Language {
    public void getType();

    public void getVersion();
}

// Implementing an Interface
// Like abstract classes, we cannot create objects of interfaces.

// To use an interface, other classes must implement it. We use the implements
// keyword to implement an interface.

interface Polygon {
    public void getArea(int length, int breadth);
    
    //default method
    public default void getSides(){
        System.out.println("This is polygon Side");
    }
}

class Rectangle implements Polygon {
    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(23,24);
        r1.getSides();
    }
}