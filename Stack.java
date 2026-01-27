// STACK 
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Top element: " + s.peek());
    }
}

class Stack{
    int[] stack;
    int size;
    int top;
    public Stack(int size){
        this.size=size;
        stack= new int[size];
        top=-1;
    }
    void push(int value){
        if(top==size-1){
            System.out.println("STACK OVERFLOW ");
            return;
        }
        stack[++top]=value;
        System.out.println(value + " pushed");
    }
    int pop(){
        if(top==-1){
            System.out.println("STACK UNDERFLOW ");
            return -1;
        }
        return stack[top--];
    }
        int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
        void display(){
            if(top==-1){
                System.out.println("STACK EMPTY");
            }
            for(int i=top;i>=0;i--){
                System.out.println("Stack "+stack[i]);
            }
        }
}

// Built in 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		 //System.out.println(s.pop());   // 30
        System.out.println(s.peek());  // 20
        System.out.println(s.isEmpty()); //true or false
        System.out.print(s.search(30));
	}
}
