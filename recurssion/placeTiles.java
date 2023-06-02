package recurssion;

public class placeTiles{

    public static int tiles(int n, int m){

        //base case
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vertical
        int vertical = tiles(n-m, m);

        // horizontal
        int horizontal = tiles(n-1, m);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        int totalPAth = tiles(n,m);
        System.out.println(totalPAth);
    }
}
