package recurssion;

public class moveAllx{

    public static void moveallx(String str, int indx, int count, String newString){

        //base case
        if(indx==str.length()){
            for(int i=0; i<count; i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(indx);
        if(currentChar=='x'){
            count++;
            moveallx(str, indx+1, count, newString);
        }
        else{
            newString += currentChar; //adding the currentchar at new string
            moveallx(str, indx+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abxcdxx";
        moveallx(str, 0, 0, "");
    }
}
