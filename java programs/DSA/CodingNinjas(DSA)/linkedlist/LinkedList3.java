import java.util.Scanner;

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}

public class LinkedList3 {

    private static Node<Integer> takeInput() throws Exception {

        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();

        while (data != -1) { // Time complexity ==> O(n)
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next; // ( or ) tail = currentNode;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    private static Node<Integer> insertNodeAtPosition(Node<Integer> head, int pos, int ele) throws Exception {
        Node<Integer> newNode = new Node<>(ele);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 0;
            Node<Integer> temp = head;
            while (temp != null) {
                if (count == pos - 1) {
                    Node<Integer> prevNode = temp;
                    newNode.next = prevNode.next;
                    prevNode.next = newNode;
                }
                count += 1;
                temp = temp.next;
            }
        }
        return head;
    }

    private static Node<Integer> deleteNodeAtPosition(Node<Integer> head, int pos) throws Exception {
        if (pos == 0)
            return head.next;
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            if (count == pos - 1) {
                Node<Integer> prevNode = temp;
                prevNode.next = temp.next;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }

    private static void print(Node<Integer> head) throws Exception {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    private static void printRecursively(Node<Integer> head) throws Exception {
        Node<Integer> temp = head;
        if(temp==null) return;
        System.out.print(temp.data+"\t");
        printRecursively(temp.next);
    }

    private static void printRecverseOrder(Node<Integer> head) throws Exception {
        Node<Integer> temp = head;
        if(temp == null) return;
        printRecverseOrder(temp.next);
        System.out.print(temp.data+"\t");
    }

    public static void main(String[] args) throws Exception {
        Node<Integer> head = takeInput();
        print(head);
        head = insertNodeAtPosition(head, 0, 200);
        print(head);
        head = deleteNodeAtPosition(head, 0);
        print(head);
        System.out.println("Print LL recursively:");
        printRecursively(head);
        System.out.println();
        System.out.println("Print LL reverse order:");
        printRecverseOrder(head);
        System.out.println();
    }
}
