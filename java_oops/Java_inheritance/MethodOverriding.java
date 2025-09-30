//Method Overriding:if the same method is defined in both the superclass and the subclass, then the method of the subclass class overrides the method of the superclass. This is known as method overriding.

//Java Overriding Rules
// 1.Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
// 2.We cannot override the method declared as final and static.
// 3.We should always override abstract methods of the superclass (will be discussed in later tutorials).


class Animal{
    public void displayInfo(){
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal{
   
    @Override
    public void displayInfo(){
        //Also we can use the super to access the method of the super class
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayInfo();
    }
}
