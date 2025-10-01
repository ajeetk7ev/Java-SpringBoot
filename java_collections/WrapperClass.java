//Wrapper Class->The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.

// Each of the 8 primitive types has corresponding wrapper classes.

// Primitive Type	Wrapper Class
// byte	    Byte
// boolean	Boolean
// char	    Character
// double	Double
// float	Float
// int	    Integer
// long	    Long
// short	Short

//Primitive Types to Wrapper Objects


public class WrapperClass{
    public static void main(String[] args) {
        // create primitive types
    //int a = 5;
    //double b = 5.65;

    //converts into wrapper objects
    // Integer aObj = Integer.valueOf(a);
    // Double bObj = Double.valueOf(b);

    // if(aObj instanceof Integer) {
    //   System.out.println("An object of Integer is created.");
    // }

    // if(bObj instanceof Double) {
    //   System.out.println("An object of Double is created.");
    // }

    //Java compiler directly convert the primitive type in to corresponding objects and this process is known as autoboxing
    // Integer aObj = a;
    // Double bObj = b;

    // System.out.println("Value of aObj "+aObj);
    // System.out.println("Value of bObj "+bObj);

    //Wrapper Objects into Primitive Types

    // creates objects of wrapper class
    Integer aObj = Integer.valueOf(23);
    Double bObj = Double.valueOf(5.55);

    // converts into primitive types
    int a = aObj.intValue();
    double b = bObj.doubleValue();

    System.out.println("The value of a: " + a);
    System.out.println("The value of b: " + b);
    }
}