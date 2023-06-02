package recurssion;

public class totalPaths{

    public static int countpaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        //move downwards
        int downwards = countpaths(i+1, j, n, m);

        //move right
        int rightPaths = countpaths(i, j+1, n, m);

        return downwards + rightPaths;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        int totalPath = countpaths(0, 0, n, m);
        System.out.println(totalPath);
    }
}
