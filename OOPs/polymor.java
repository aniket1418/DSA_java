package OOPs;
//example of overloading and polymor
// Compile time polymorphism

class Students {
    String name;
    int age;

    public void printInfo(String name){
        this.name = name;
        System.out.println(name + "  ");
    }

    public void printInfo(int age){
        this.age = age;
        System.out.println("age" +age);
    }

    public void printInfo(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name" + name + "" + age);
    }
}


public class polymor{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "aniket";
        s1.printInfo(s1.name);

        Students s2 = new Students();
        s2.age = 24;
        s2.printInfo(s2.age);

        Students s3 = new Students();
        s3.name = "aniket mehta";
        s3.age = 23;
        s3.printInfo(s3.name, s3.age);
    }
}
