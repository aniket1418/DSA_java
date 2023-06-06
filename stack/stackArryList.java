package stack;

import java.util.ArrayList;

public class stackArryList {
    
    static class Stack {    
        static ArrayList<Integer> list = new ArrayList<>();
        //To check the, is the value is present or not?
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //To push the variable to the stack
        public static void pushList(int data){
            list.add(data);
        }

        //To pop the value from stack
        public static int popList(){
            if(isEmpty()){
                return -1;
            }
            int top = list.size()-1;
            list.remove(list.size()-1);
            return top;
        }

        //To peek the value from stack
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.size()-1;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.pushList(1);
        s.pushList(2);
        s.pushList(5);
        System.out.println(s.peek());
    }   
    
}
