package linklist;

public class LinkLst {
    Node head;

    
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node currentNode;
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("There is no element to delete");
            return;
        }

        if(head.next==null){
            head = null;
            return;
        }

        head.next = head;        
    }

    //delete the last elements
    public void deleteLast(){
        if(head == null){
            System.out.println("There is no element to delete");
            return;
        }

        if(head.next==null){
            head = null;
            return;
        }

        Node lastNode;
        Node secondLast;
        lastNode = head.next;
        secondLast = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;       
    }

    // Reverse the link list
    public void reverseList(){

        //bare conditions
        if(head == null && head.next == null){
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while(currentNode!=null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //Update
            prevNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    //prinnt the list
    public void printLL(){
        Node currentNode;
        currentNode = head;
        while(currentNode!= null){
            System.out.print(currentNode.data + "=>");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
}
