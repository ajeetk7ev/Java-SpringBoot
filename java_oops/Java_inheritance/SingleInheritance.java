
//1. Single Inheritance -> In single inheritance, one class inherits another.

class Person{
     protected String name;
     protected int age;
}

class Student extends Person{
    private String rollNo;
    private String branch;

    public Student(String name, int age, String rollNo, String branch){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void getStudentData(){
        System.out.println("Student Name is : "+this.name);;
        System.out.println("Student Age is : "+this.age);;
        System.out.println("Student RollNo is : "+this.rollNo);
        System.out.println("Student Branch is : "+ this.branch);;
    }
}



public class SingleInheritance{
    public static void main(String[] args) {
       Student st = new Student("Ajeet Kumar", 22, "22781A32F5", "CSD");
       st.getStudentData();
    }
}