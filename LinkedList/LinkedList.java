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

        public int getValue(){
            return this.value;
        }
    }

    public LinkedList(){

        head = null;
        tail = null;
        length = 0;
    }

    public LinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
	//                                                          //
	//                                                          //
	//                                                          //
	//////////////////////////////////////////////////////////////
	public void append(int value){

        Node newNode = new Node(value);
        
        if(head == null){
            head = newNode;
            tail = newNode; 
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public Node removeLast(){
        if(length == 0){
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
        if(length==0) return null;
        
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            System.out.println("Node not present at index " + index);
            return null;
        } else {
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    // public boolean set(int index,int value){
    //     if(index < 0 || index >= length){
    //         System.out.println("Node not present at index " + index);
    //         return false; 
    //     }else{
    //         Node temp = head;
    //         for(int i=0;i<length;i++){
    //             if(i==index){
    //                 temp.value = value;
    //                 return true;
    //             }
    //             temp = temp.next;
    //         }
    //         return false;
    //     }
    // }

    public boolean set(int index,int value){
        Node targetNode = get(index);
        if(targetNode != null){
            targetNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index,int value){
        if(index<0 || index>length){
            System.out.println("Check your Index!! "+index);
            return false;
        }
        if(index==0){ 
            prepend(value);
            return true;
        }
        if(index==length){ 
            append(value);
            return true;
        }
        else{
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    public Node remove(int index){
        
        if(index<0 || index>=length) return null;

        if(head==null) return null;
        
        if(index == 0) return removeFirst();

        if(index == length-1) return removeLast();

        Node temp = get(index-1);
        Node removedNode = temp.next;
        temp.next = removedNode.next;
        removedNode.next = null;
        length--;
        return removedNode;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        
        Node after = temp.next;
        Node before = null;
        
        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        
    }

    public Node findMiddleNode(){
        Node fast = head;
        Node slow = head;
        
        if(head == null) return null;
        
        if(fast.next == null) return slow;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
    public int getValueAt(int index){
        Node node = get(index);
        return node != null ? node.getValue() : -1; // or throw exception, based on design
    }
    

}