public class LinkedList{
    private Node front;
    private int count;

    public LinkedList(){}

    public Node getFront(){
        return front;
    }

    public void append(Node x){
        if(front==null){
            front=x;
        }else{
            Node y = front;
            while(y.getNext()!=null){
                y=y.getNext();
            }
            y.setNext(x);
        }
    }

    public void insert(Node x, int a){
        Node y = front;
        
        for(int i = 0; i<=a; i++){
            if(a==0){
                x.setNext(front);
                front = x;
                break;
            }
            if(y.getNext()==null){
                y.setNext(x);
                break;
            }else if(i==a-1){
                x.setNext(y.getNext());
                y.setNext(x);
                break;
            }
            y=y.getNext();
        }
    }

    public Node remove(int a){
        Node x = null;
        Node y = front;
        if(a==0){
            x=y;
            front = y.getNext();
            return x;
        }
        for(int i = 0; i<a; i++){
            if(i==a-1){
                if(y.getNext()==null){
                    x=y.getNext();
                    y.setNext(null);
                    return x;
                }else{
                    x=y.getNext();
                    y.setNext(y.getNext().getNext());
                    return x;
                }
            }else if(y.getNext()==null){
                return null;
            }
            y=y.getNext();
        }
        return null;
    }

    public String toString(){
        String x = "";
        Node y = front;
        if(y==null){
            return "There are no items in this list.";
        }
        for(int i = 0; y!=null; i++){
            x+="Index: " + i + " Data: " + y.getData() + "\n";
            y=y.getNext();
        }
        return x;
    }
}