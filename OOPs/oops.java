package OOPs;


// creating  a class and initaiting the objects
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Student1{
    String name;
    int age;
    // parameterizes constructor
    Student1(){
        this.name= name;
        this.age=age;
    }
    public void printInfo(){
        System.out.println(name+""+age);
    }
}

class Student2{
    String name;
    int age;
    // parameterizes constructor
    Student2(String name, int age){
        this.name= name;
        this.age=age;
    }
    public void printInfo(){
        System.out.println(name+""+age);
    }
}

class Student3{
    String name;
    int age;
    // parameterizes constructor
    Student3(Student2 s3){
        this.name= s3.name;
        this.age=s3.age;
    }
    public void printInfo(){
        System.out.println(name+""+age);
    }
}

public class oops{
    public static void main(String[] args) {
        //initiating the class and objects
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.age = 24;
        s1.printInfo();
        // non parameterized constructor
        Student s2 = new Student();
        s2.name = "aniket mehta";
        s2.age = 24;
        s2.printInfo();
        // parameterized constructor
        Student2 s3 = new Student2("AM", 24);
        s3.printInfo();
        //copy constructor
        Student3 s4 = new Student3(s3);
        s4.printInfo();
    }
}
