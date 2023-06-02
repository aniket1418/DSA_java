package recurssion;

public class sortedArry{

    public static boolean checkArry(int arry[], int indx){
        if(indx==arry.length-1){
            return true;
        }
        if (arry[indx] < arry[indx+1]){
            return checkArry(arry, indx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arry = new int[]{1,2,3,67};
        System.out.println(checkArry(arry, 0)); 
    }
}
