package recurssion;

import java.util.ArrayList;

public class subset{


    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + "");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset ){
        if(n==0){
            printSubset(subset);
            return;
        }

        // we adding
        subset.add(n);
        findSubset(n-1, subset);

        // we are removing
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n=123;
        findSubset(n, subset);
    }
}
