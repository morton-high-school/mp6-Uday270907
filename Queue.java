public class Queue extends LinkedList{
    public Queue(){
        super();
    }

    public void add(Node a){
        this.append(a);
    }

    public Node remove(){
        Node a = LinkedListUtil.getNode(this, 0);
        super.remove(0);
        return a;
    }

    public Node peek(){
        return LinkedListUtil.getNode(this, 0);
    }

    public boolean empty(){
        return LinkedListUtil.length(this)==0;
    }

    public int search(Node a){
        Node y = this.getFront();
        for(int i = 0; y!=null; i++){
            if(y.equals(a)){
                return i;
            }
            y=y.getNext();
        }
        return -1;
    }
}