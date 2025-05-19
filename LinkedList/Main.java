public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);

        
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        System.out.println(myLinkedList.getValueAt(3));

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