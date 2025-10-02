
// Generics in Java are a feature that allows classes, interfaces, and methods to operate on objects of various types while providing compile-time type safety. They enable you to write code that is more reusable and less error-prone by specifying a placeholder for the type (like T, E, K, V) that gets replaced with a concrete type when the code is used.

// Generic class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

//Generic Class with Multiple Type Parameters
class Test<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


public class Generics_Main {
    public static void main(String[] args) {

        //Integer
        // Box<Integer> intBox = new Box<>();
        // intBox.set(123);
        // System.out.println("PRINTING BOX VALUE : "+intBox.get());

        //String
        Box<String> intBox = new Box<>();
        intBox.set("AALo PARATHA");
        System.out.println("PRINTING BOX VALUE : "+intBox.get());

        Test <String, Integer> obj =
            new Test<String, Integer>("SPRINGBOOT", 15);

        obj.print();
    }
}