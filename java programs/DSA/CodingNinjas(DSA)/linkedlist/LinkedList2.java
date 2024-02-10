import java.util.Scanner;

class Node<T>{
    T data;
    Node next;
    Node(T data){
        this.data = data;
    }
}

public class LinkedList2 {

    private static Node<Integer> takeInput(){
        
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null;
        int data = s.nextInt();

        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
            }
            else{
                Node<Integer> tail = head;
                while(tail.next != null){                           // Time complexity --- O(n^2)  ==> Nested while loop
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    private static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        
    }
}
