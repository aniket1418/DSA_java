import linklist.LinkLst;

public class reverseLL {
    public static void main(String[] args) {
        LinkLst link = new LinkLst();
        link.addFirst("1");
        link.addFirst("2");
        link.addLast("3");
        link.addLast("4");
        System.out.println("Without reverse");
        link.printLL();
        System.out.println("With reverse");
        link.reverseList();
        link.printLL();
    }
    
}
