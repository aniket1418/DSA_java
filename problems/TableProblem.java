package problems;

import java.util.Scanner;

/*
 * Problem 02 - Print the table of a number input by the user
 */
/*
 * Solution and approach - 
 * take input from user and store to a new variable, then run the loop and multiple it with the user number
 * ex - user input = 4
 * run loop untill 10, and every time with 4
 * 4 x 1 = 4
 * 4 x 2 = 8......
 */

class TableProblem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i<=10; i++){
            result = number * i;
            System.out.println(result);
        }
    }
}
