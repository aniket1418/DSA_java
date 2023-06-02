package linklist;

public class swap{
    Node head;
    
    public class Node{
        String data;
        Node next;      
        Node(String data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public void swapNumber(){
        Node prevNode=head;
        Node currentNode = head.next;

        while(currentNode!= null){
            Node nextNode = currentNode.next;
            currentNode = prevNode;
            
            
        }
    }

    public static void main(String[] args) {
        
    }
}
