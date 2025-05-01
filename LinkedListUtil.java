public class LinkedListUtil{
    public static int length(LinkedList x){
        int count = 1;
        Node y = x.getFront();
        if(y==null){
            return 0;
        }
        while(!(y.getNext()==null)){
            y=y.getNext();
            count++;
        }
        return count;
    }

    public static int search(LinkedList x, int a){
        Node y = x.getFront();
        int count = 1;
        while(y.getNext().getData()!=a){
            y=y.getNext();
            count++;
            if(y.getNext()==null){
                return -1;
            }
        }
        return count;
    }

    public static Node getNode(LinkedList x, int a){
        Node y = x.getFront();
        for(int i = 0; i<=a; i++){
            if(i==a){
               return y;
            }
            if(y.getNext()==null){
                return null;
            }
            y=y.getNext();
        }
        return null;
    }

    public static int count(LinkedList x, int z){
        int count = 0;
        Node y = x.getFront();
        while(!(y==null)){
            if(y.getData()==z){
                count++;
            }
            y=y.getNext();
        }
        return count;
    }

    public static boolean compare(LinkedList x, LinkedList y){
        Node a = x.getFront();
        Node b = y.getFront();
        if(length(x)!=length(y)){
            return false;
        }
        while(a!=null && b!=null){
            System.out.println(a.getData() + " , " + b.getData());
            if(a.getData()!=b.getData()){
                return false;
            }
            a=a.getNext();
            b=b.getNext();
        }
        System.out.println("How the heck does this not work?!");
        return true;
    }

    public static LinkedList reverse(LinkedList x){
        LinkedList y = new LinkedList();
        y.append(getNode(x, length(x)-1));
        for(int i = length(x)-2; i>=0; i--){
            Node a = new Node(getNode(x, i).getData());
            y.append(a);
        }
        return y;
    }
}