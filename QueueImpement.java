class QueueArray{
    int [] queue;
    int front,rear,size,capacity;

    QueueArray(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    public void enqueue(int data){
        if(size==capacity){
            System.out.println("Queue is overflow");
            return;
        }
        rear++;
        queue[rear]=data;
        size++;
        System.out.println("Data is added successfully");
    }

    public void dequeue(){
        if(size==0){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(queue[front]);
        front++;
        size--;
    }

    public void peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[front]);
    }


    public void display(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]+" ");
        }
        System.out.println();
    }

}





public class QueueImpement{
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(50);

        q.display();
    }
}