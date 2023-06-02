package recurssion;

public class callGuest{

    public static int guestWays(int n){ 

        if(n<=1){
            return 1 ;
        }
       
        // ways one, when guest comes alone
        int way1 = guestWays(n-1);

        // way two, when guest coming in pair
        int way2 =(n-1) * guestWays(n-2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n =4;
        int totalCount = guestWays(n);
        System.out.println(totalCount);
    }
    
}
