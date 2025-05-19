public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.prepend(5);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

    }

}