public class Stack extends LinkedList{
    public Stack(){
        super();
    }

    public void push(Node a){
        this.append(a);
    }

    public Node pop(){
        return this.remove(LinkedListUtil.length(this)-1);
    }

    public Node peek(){
        return LinkedListUtil.getNode(this, LinkedListUtil.length(this)-1);
    }

    public boolean empty(){
        return LinkedListUtil.length(this)==0;
    }

    public int search(Node a){
        Node y = this.getFront();
        for(int i = 0; y!=null; i++){
            if(y.getData()==a.getData()){
                return LinkedListUtil.length(this)-1-i;
            }
            y=y.getNext();
        }
        return -1;
    }
}