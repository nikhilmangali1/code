import java.util.LinkedList;
import java.util.Scanner;

public class DoubleLinkedList1 {
    public static void display(LinkedList<Integer> dobList)
    {
         System.out.print("Current List: ");
            for (Integer item : dobList) {
                System.out.print(item + " <-> ");
            }
            System.out.println("NULL");
    }
    public static void main(String[] args) {
        int choice, ele, pos;
        LinkedList<Integer> dobList = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Insert at the beginning");
        System.out.println("2. Insert at the end");
        System.out.println("3. Insert at a position");
        System.out.println("4. Delete an element");
        System.out.println("5.Display");
        System.out.println("6. Exit");

        do {
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element:");
                    ele = sc.nextInt();
                    dobList.addFirst(ele);
                    break;
                case 2:
                    System.out.println("Enter element:");
                    ele = sc.nextInt();
                    dobList.addLast(ele);
                    break;
                case 3:
                    System.out.println("Enter position:");
                    pos = sc.nextInt();
                    if (pos <= dobList.size()) {
                        System.out.println("Enter element:");
                        ele = sc.nextInt();
                        dobList.add(pos, ele);
                    } else {
                        System.out.println("Enter a valid position between 0 and " + dobList.size());
                    }
                    break;
                case 4:
                    System.out.println("Enter element to be deleted:");
                    int rm = sc.nextInt();
                    if (dobList.contains(rm)) {
                        dobList.remove(Integer.valueOf(rm)); 
                        System.out.println("Element " + rm + " deleted.");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 6:
                    System.out.println("Program terminated");
                    break;
                case 5:
                    display(dobList);
                    break;
                default:
                    System.out.println("Enter a correct choice");
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}
