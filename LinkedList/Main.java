public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.append(5);
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.removeFirst();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.removeFirst();
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