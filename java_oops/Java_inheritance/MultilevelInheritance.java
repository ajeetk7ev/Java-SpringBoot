
// Java super Keyword
// In Java, the super keyword is used to refer to the parent class of a subclass.

// The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

// It can be used in two main ways:

// To access attributes and methods from the parent class
// To call the parent class constructor

class GrandParent {
    protected String name;
    protected int age;
    protected String address;
    protected String occupation;

    public GrandParent(String name, int age, String address, String occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
    }

    public void displyData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
        System.out.println("Occupation : " + this.occupation);
    }

}

class Parent extends GrandParent {
    protected String company;
    protected int salary;
    
    public Parent(String name, int age, String address, String occupation, String company, int salary) {
        super(name, age, address, occupation);
        // this.name = name;
        // this.age = age;
        // this.occupation = occupation;
        // this.address = address;
        this.company = company;
        this.salary = salary;
    }
     
     public void displyData() {
        super.displyData();
        System.out.println("Company : " + this.company);
        System.out.println("Salary : " + this.salary);
    } 
}

class Child extends Parent{
      private String college;
      private String collegeId;
      private String branch;

      public Child(String name, int age, String address, String occupation, String company, int salary, String college, String collegeId, String branch){
        super(name, age, address, occupation, company, salary);
        this.college = college;
        this.collegeId = collegeId;
        this.branch = branch;
      }

      public void displyData(){
        super.displyData();
        System.out.println("College : "+this.college);
        System.out.println("CollegeID : "+this.collegeId);
        System.out.println("Branch : "+this.branch);
      }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        GrandParent g1 = new GrandParent("Lalan Yadav", 65, "Pinjroin", "Farmer");
        Parent p1 = new Parent("Ravindra Yadav", 41, "Pinjroin", "Private Job", "Accenture", 3000);
        Child c1 = new Child("Ajeet Kumar", 22, "Pinjroin", "Software Engineer", "Google", 300000, "SVCET", "22781A32F5", "CSD");

         System.out.println("-----PRINTING GRANDPARENTDATA------");
         g1.displyData();

         System.out.println("-----PRINTING PARENTDATA-----");
         p1.displyData();

         System.out.println("-----PRINTING CHILDDATA------");
         c1.displyData();
       
    }
}
