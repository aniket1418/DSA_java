package ArryList;
import java.util.*;
public class arrylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // get particular elements
        int element = list.get(0);
        System.out.println(element);

        //add instance variable
        list.add(2, 77);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);
        
        //loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(","+list.get(i));
        }

        System.out.println();
        System.out.println(list);


        //Collection sort
        Collections.sort(list);
        System.out.println(list);
    }

}
