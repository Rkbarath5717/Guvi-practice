import java.util.*;

class Stack{
    int arr[];
    int size;
    int top;

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    //push operation
    void push(int value){
        if(top==size-1){
            System.out.println("Stack is OverFlow");
        }
        else{
            arr[++top]=value;
            System.out.println("The value of  " + value + " is pushed");
        }
    }
    //pop operation
    void pop(){
        if(top==-1){
            System.out.println("stack is underflow");
        }
        else{
            System.out.println(arr[top]+ " value is remove");
            top--;
        }
    }
    //peek operation
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]+  "   This is the top element");
        }
    }
    //isEmpty
    void empty(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
    //isFull operation
    void full(){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Stack is  Not full");
        }
    }
    
    //Display operation

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}

public class ArrayUsingStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        Stack s = new Stack(n);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.pop();
        s.empty();
        s.peek();
        s.full();
        s.display();

    }
}