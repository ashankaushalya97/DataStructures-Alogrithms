class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class Queve{
    private Node[] arr = new Node[5];
    private int index=0;

    public void enque(int data){
        arr[index]=new Node(data);
        index++;
    }
    public void deque(){
//        for (int i = 0; i <arr.length-1 ; i++) {
//            arr[i]=arr[i+1];
//        }
//        index--;
        for (int i = 0; i <arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        index--;
    }

    public void print(){
        String display = "[";
        for (int i = 0; i <index ; i++) {
            display+=arr[i].data + ",";
        }
        display+="\b]";
        System.out.println(display);
    }
}

class stack{
    Node[] arr = new Node[5];
    int index=0;

    public void push(int data){
        arr[index]=new Node(data);
        index++;
    }

    public void pop(){
//        for (int i = arr.length-1; i <0 ; i--) {
//            arr[i]=arr[i-1];
//        }
//        index--;
        for (int i = arr.length-1; i <0 ; i--) {
            arr[i]=arr[i-1];
        }
        index--;
    }
    public void print(){
        String display = "[";
        for (int i = 0; i <index ; i++) {
            display+=arr[i].data + ",";
        }
        display+="\b]";
        System.out.println(display);
    }

}

public class Demo1 {
    public static void main(String[] args) {
        Queve q = new Queve();
        stack stack = new stack();
        q.enque(5);
        q.enque(10);
        q.enque(15);
        q.enque(26);
        q.print();

        q.deque();
        q.deque();
        q.deque();
        q.print();

//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.print();
//
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.print();
    }
}
