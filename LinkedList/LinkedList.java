public class LinkedList {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	//                                                          //
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(){

        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public LinkedList(int value){

        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }
	//                                                          //
	//                                                          //
	//                                                          //
	//////////////////////////////////////////////////////////////
	public void append(int value){

        Node newNode = new Node(value);
        
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode; 
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        this.length++;
    }

    public Node removeLast(){
        if(this.length == 0){
            return null;
        }
         Node temp = head;
         Node pre = head;

         while(temp.next != null){
            pre = temp;
            temp = temp.next;
         }
         tail = pre;
         tail.next = null;
         length--;
         if(length==0)
         {
             head=null;
             tail=null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if(length==0){
            return null;
        }else if(length==1){
            head = null;
            tail = null;
            temp.next = null;
            length--;
            return temp;
        }else{
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }

    }
	
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}