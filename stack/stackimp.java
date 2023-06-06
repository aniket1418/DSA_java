package stack;

public class stackimp {
    //Node Class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //Implementing the stack class;
    static class stack{
        public static Node head = null;
        //push implementation
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //to check, is stack is empty or not?
        public static boolean isEmpty(){
            return head==null;
        }
        //To pop the value from stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        // to peek the top value of stack
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }

        //To print the stack
        public static void printStack(){
            Node currentNode;
            currentNode = head;
            while(currentNode!= null){
                System.out.print(currentNode.data + "=>");
                currentNode = currentNode.next;
            }
            System.out.println("NULL");
            }
    }

    public static void main(String[] args) {
        stack stackimpl = new stack();
        stackimpl.push(1);
        stackimpl.push(3);
        stackimpl.push(4);
        System.out.println(stackimpl.peek());
        stackimpl.pop();
        stackimpl.printStack();
    }


}

