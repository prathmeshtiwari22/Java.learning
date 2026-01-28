// Queue scratch
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MyQueue q = new MyQueue(n);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();
    }
}

class MyQueue {
    int size, front, rear;
    int[] q;

    MyQueue(int size) {
        this.size = size;
        q = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        q[++rear] = val;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        return q[front++];
    }

    void display() {
        if (front > rear) {
            System.out.println("QUEUE EMPTY");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
//Circular Queue
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CircularQueue q = new CircularQueue(n);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
        q.display();
    }
}
class CircularQueue {
    int[] q;
    int front, rear, size;

    CircularQueue(int size) {
        this.size = size;
        q = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int val) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = val;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int data = q[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return data;
    }
    void display() {
    if (front == -1) {
        System.out.println("Queue Empty");
        return;
    }

    int i = front;
    while (true) {
        System.out.print(q[i] + " ");
        if (i == rear)
            break;
        i = (i + 1) % size;
    }
    System.out.println();
}

}
//Queue built in:
import java.util.*;

public class Main {
    public static void main(String[] args) {
     Queue<Integer> q=new LinkedList<>();
     q.offer(10);
     q.offer(20);
     q.offer(40);
     System.out.println(q);      
     System.out.println(q.poll()); 
     System.out.println(q.peek()); 
}
}
//DeQueue built in
import java.util.Deque;
import java.util.ArrayDeque;
public class Main
{
	public static void main(String[] args) {
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(10);
dq.addLast(20);
dq.removeFirst();
dq.removeLast();
	}
}
//PriorityQueue
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq.poll()); // 10

	}
}
