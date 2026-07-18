import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class stack{
    Node top;

    void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;

        System.out.println("New value is "+ value + "  pushed");
    }

    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data + "     this is pop");
        }
    }

    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data+"   This is top value of the node");
        }
    }

    void empty(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }

    void display(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;

        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class LinkedUsingStack {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(70);
        s.push(80);
        s.push(90);
        s.pop();
        s.peek();
        s.empty();
        s.pop();
        s.display();
        s.push(30);
        s.display();
    }
}