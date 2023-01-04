package Patterns;

/*
 * Problem - Make a half pryamid  in a reverse order.
 * expected output - 
 *  * * * * * 
 *  * * * * 
 *  * * * 
 *  * *
 *  *
 * 
 * Solutions - 
 * for loop should be in reverse order.
 * outer loop will be for rows
 * inner loop for a column, to print the number star in column.
 */

public class Patter04 {
    public static void main(String[] args) {
        int n = 5;
        for ( int i = n; i >= 1; i--){
            for(int j = i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
