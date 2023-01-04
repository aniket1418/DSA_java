package Patterns;

/*Problem  - Make a half triangle, pyramid */
/*
 * Expected output - 
 *  * 
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

 /*
  * Solution - outer loop will run for row and inner loop for column star.
  */
public class Patter03 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
