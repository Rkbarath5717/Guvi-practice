class Queue{

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + "   Added");
    }

    void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println( front.data + " Deleted Node ");

        front = front.next;

        if(front == null){
            rear = null;
        }
    }

    void display(){
        if(front == null){
            System.out.println("Queue is empty ");
            return;
        }
        Node temp = front;

        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    void peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element " + front.data);
    }

}




public class QueueLinkldList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(70);
        q.enqueue(30);
        q.dequeue();
    }
}