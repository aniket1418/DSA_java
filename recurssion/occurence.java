package recurssion;

public class occurence{
    public static int first = -1;
    public static int last = -1; 
    public static void occurenceFind(String str, int indx, char element){      
        if(indx==str.length()){
            System.out.println(first);
            System.out.println(last);
        }  
        
        char currentChar = str.charAt(indx);
        if(currentChar==element){
            if(first==-1){
                first=indx;
            }
            else{
                last=indx;
            }
        }

        occurenceFind(str, indx+1, element);
    }

    public static void main(String[] args) {
        String str="abbcdaabcfa";
        char element='a';
        occurenceFind(str, 0 ,element);
    }
}
