package recurssion;

import java.util.HashSet;

public class uniqueSubse{

    public static void subseq(String str, int indx, String newString, HashSet<String> set){

        if(indx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(indx);
        //to choose
        subseq(str, indx+1, newString+currentChar, set);
        
        //not to choose
        subseq(str, indx+1, newString, set);
    } 

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "abc";
        subseq(str, 0, "", set);
    }
}
