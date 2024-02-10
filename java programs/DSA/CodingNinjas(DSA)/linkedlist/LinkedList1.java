class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;  
    }
}
public class LinkedList1 {
    private static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;

    }

    private static void printLinkedList__1(Node<Integer> head){
        System.out.println(head);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);

    }

    private static void printLinkedList__2(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void incrementElementByOne(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    private static int lengthOfTheLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null){
            count+=1;
            temp = temp.next;
        }
        return count;
    }

    private static void print_ith_Node(Node<Integer> head, int i, int size){
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(i<=size && i==count) System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printLinkedList__1(head);      //statically - boring
        System.out.println("------------------------------");
        incrementElementByOne(head);
        printLinkedList__2(head);
        int len=lengthOfTheLinkedList(head);
        System.out.println("The length of the linkedList -> "+len);
        int i = 2;
        print_ith_Node(head,i,len);
    }
}
