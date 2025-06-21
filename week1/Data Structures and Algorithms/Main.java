package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(44);
        list.insertfirst(55);
        list.insertfirst(66);
        list.insertfirst(77);
        list.insertend(100);
        list.insert(400,2);
        list.display();
    }
}
