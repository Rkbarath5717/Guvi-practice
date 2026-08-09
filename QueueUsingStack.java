import java.util.*;
class QueueStack{

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    void enqueue(int data){
        s1.push(data);
        System.out.println(s1+ "  Added successfully ");
    }


    void dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty ");
            return;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        System.out.println(s2.pop()+  " deleted");
    }


    void peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty ");
            return;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        System.out.println("Front : " + s2.peek());
    }
}



public class QueueUsingStack {
    public static void main(String[] args) {
        QueueStack s = new QueueStack();
        s.enqueue(10);
    }
}