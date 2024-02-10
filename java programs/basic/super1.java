class Parent {
    Parent(String s) {
        System.out.println("Parent Constructor - " + s);
    }

    String message = "Parent";

    void display() {
        System.out.println(message);
    }
}

class Child extends Parent {
    Child() {
        super("heloo");
    }

    String message = "Child"; // Hides message in Parent

    void display() {
        super.display(); // Calls display() of Parent
        System.out.println(message);
        System.out.println(super.message);
    }
}

public class super1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
