package java_oops;
//Concept Learn -> Class and Object creation, Constuctor, this keywork

class Student{
    private String name;
    private int age;
    private String email;
    private String branch;

    public Student(String name, int age, String email, String branch){
        this.name = name;
        this.age = age;
        this.email = email;
        this.branch = branch;
    }

    public void getter(){
        System.out.println("Student Name is : "+this.name);
        System.out.println("Student Age is : "+this.age);
        System.out.println("Student email is : "+this.email);
        System.out.println("Student Branch is : "+this.branch);
    }

}


public class Oops_First {
    public static void main(String[] args) {
        Student st1 = new Student("Ajeet kumar", 22, "ajeet@gmail.com", "CSD");

        st1.getter();
    }
}