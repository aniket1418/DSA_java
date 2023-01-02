import java.util.Scanner;

public class Switch_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Nameste");
            break;
            default : System.out.println("Bye Bye");
            break;
        }
    }
}
