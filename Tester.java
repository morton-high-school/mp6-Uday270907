public class Tester{
    public static void main(String[] args){
        Stack x = new Stack();
        x.push(new Node(3));
        x.push(new Node(6));
        x.push(new Node(9));
        Node a = new Node(6);
        x.push(a);
        System.out.println(x.search(a));
    }
}