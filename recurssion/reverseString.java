package recurssion;

public class reverseString {
    
    public static void reverseTheString(String str, int indx){

        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        reverseTheString(str, indx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        int indx=str.length()-1;
        reverseTheString(str, indx);
    }
}
