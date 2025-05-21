public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(12);
        myLinkedList.append(22);
        myLinkedList.append(45);
        myLinkedList.append(66);


        
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.reverse();

        
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