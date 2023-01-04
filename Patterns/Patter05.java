package Patterns;
/* Problem - Inverted Pyramid, 180 rotated */
/*
 * Expected output - 
 *          *
 *        * *
 *      * * *
 *    * * * *
 * 
 * Solution - 3 loops will be executed
 * 1st loop for star in row.
 * 2nd loop for space
 * 3rd loop for star in column
 */ 
public class Patter05 {
    public static void main(String[] args) {
        int n  = 5;
        //outer loop
        for (int i =1; i<=n; i++){
            // for space loop
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
