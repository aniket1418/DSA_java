package recurssion;

class mergeSort{

    public static void divide(int[] arry, int si, int ei){

        int mid=si+(ei-si)/2;
        divide(arry, si, mid);
        divide(arry, si, mid+1); 
    }
    public static void main(String[] args) {
        int[] arry = {3,7,2,5,9,8};
    }
}
