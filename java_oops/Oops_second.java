package java_oops;
//Concept Learn -> Java Non-Access Modifiers(final, static, abstract)

public class Oops_second {

    // static->A static method means that it can be accessed without creating an
    // object of the class, unlike public:
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public Method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //final->If you don't want the ability to override existing attribute values, declare attributes as final:
    final int val = 10;

    public static void main(String[] args) {
        // Calling static method
        myStaticMethod();
        
        Oops_second myObj = new Oops_second();

        //with the help of myObj we can call public method
        myObj.myPublicMethod();
        
        //i can not reassigned the val attribute just like const in js
        //myObj.val = 20;
        System.out.println("PRINTING VALUE : "+myObj.val);

        Instructor u1 = new Instructor();
        u1.getter();

    }
}


//Abstract->An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

abstract class User{
    public String name;
    public String id;
    public String email;

   public abstract void getter();
}

class Instructor extends User{
    public void getter(){
        System.out.println("PRINTING USER DATA");
    }
}