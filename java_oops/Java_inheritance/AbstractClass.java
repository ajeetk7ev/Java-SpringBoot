//Abstract class:The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class.

// Java Abstract Method->
// A method that doesn't have its body is known as an abstract method. We use the same abstract keyword to create abstract methods.


abstract class Language {

  // abstract method
  abstract void method1();

  // regular method
  void method2() {
    System.out.println("This is regular method");
  }
}

class Hindi extends Language{
    public void method1(){
        System.out.println("This is abstract method");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
       Hindi h1 = new Hindi();
       h1.method1();
       h1.method2();
    }
}

//Key Points to Remember
// We use the abstract keyword to create abstract classes and methods.
// An abstract method doesn't have any implementation (method body).
// A class containing abstract methods should also be abstract.
// We cannot create objects of an abstract class.
// To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
// A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
// We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,
// Animal.staticMethod();