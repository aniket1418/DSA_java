import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 15){
            System.out.println("Not adult");
        }
        else{
            System.out.println("Adult");
        }
    }
}
