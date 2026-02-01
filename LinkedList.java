import java.util.*;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertionatStart(10);
        list.insertionatEnd(20);
        list.insertionatEnd(30);
        list.insertAfterValue(20, 25);
        list.insertionatplace(5, 1);

        list.display();
    }

    static class SinglyLinkedList {
        Node head;

        public void insertionatStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public void DeletionatStart() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            }
            public void DeletionatEnd() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }

    Node temp = head;
    Node p = head.next;

    while (p.next != null) {
        temp = temp.next;
        p = p.next;
    }

    temp.next = null;
}
 
       public void Deletionatplace(int place) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (place == 1) {
        head = head.next;
        return;
    }

    Node temp = head;
    int count = 1;

  
    while (temp.next != null && count < place - 1) {
        temp = temp.next;
        count++;
    }

    if (temp.next == null) {
        System.out.println("Invalid position");
        return;
    }

    temp.next = temp.next.next;
}

 


        public void insertionatEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void insertionatplace(int data, int place) {
            Node newNode = new Node(data);

            if (place == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node temp = head;
            int count = 0;

            while (temp != null && count < place - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        void insertAfterValue(int value, int data) {
            Node temp = head;

            while (temp != null && temp.data != value) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Value not found");
                return;
            }

            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
//doubly
// circular
// built in :

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.add(30);   
        list.add(2, 25); // insert at index 2
        int index = list.indexOf(20);
        if (index != -1) {
            list.add(index + 1, 25);
            }
        for (int x : list) {
            System.out.print(x + " ");
        }
        list.remove(); //first 
        list.removeLast(); //Last 
        System.out.println(" ");
         for (int x : list) {
            System.out.print(x + " ");
        }
	}
}
