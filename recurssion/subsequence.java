package recurssion;

public class subsequence{

    public static void subseq(String str, int indx, String newString){
        //str = abcd
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(indx); // currentchar = a
        //to choose
        subseq(str, indx+1, newString+currentChar); 
        
        //not to choose
        subseq(str, indx+1, newString);
    } 

    public static void main(String[] args) {
        String str = "abcd|@";
        subseq(str, 0, ""); // Dry run, 1st iteration => abcd 
    }
}
