package LinkedList;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size =0;


    public void insertfirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        if(tail==null) tail = head;
        size = size +1;
    }
    public void insertend(int val){
        if(size ==0) {
            insertfirst(val);
            return;
        }
            Node n = new Node(val);
            tail.next = n;
            tail = n;
            size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size) {
            insertend(val);
            return;
        }
        Node n = new Node(val);
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public class Node{
        private int val;
        private Node next;

        public Node (int val , Node next){
            this.val = val;
            this.next = next;
        }
        public Node (int val){
            this.val = val;
        }
    }
}
