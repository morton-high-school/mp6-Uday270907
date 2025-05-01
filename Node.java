public class Node{
    private int data;
    public Node next;

    public Node(int d){
        data = d;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }
}