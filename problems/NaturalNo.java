package problems;

import java.util.Scanner;

/*
 * Problem 1 - Print the sum of first n Natural numbers.
 */
/*
 * Solution - Let's say n=4
 * 1 + 2 + 3 + 4 = 10
 * Loop through the numbers and add it and store it in new variable. 
 */
 class NaturalNo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
1
        System.out.println("Enter the number");
        int number = input.nextInt();

        int total = 0;

        for(int i = 0; i <= number; i++){
            total = total + i;
        }
        System.out.println("Total sum, " + total);
    }
 }
