package WilliamFiset.Stack;

public class LinkedList {

    private int size;
    private Node head;
    private Node tail;

    LinkedList(){
        head = null;
        tail = null;
        size =0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void insert(Object item){
        Node node = new Node(item);
        if(head == null){

        }
    }
    class Node{

        Object data;
        Node next;

        Node(Object data ){
            this.data = data;
            this.next = next;
        }
    }


}
