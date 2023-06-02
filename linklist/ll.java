package linklist;

class ll{
        public static void main(String[] args) {
        LinkLst link = new LinkLst();
        link.addFirst("a");
        link.addFirst("dd");
        link.addLast("cc");
        link.addLast("b");
        link.deleteLast();
        link.printLL();
    }
}
