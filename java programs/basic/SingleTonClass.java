class CoffeeMachine1 {
    private int coffee;
    private int water;
    private static CoffeeMachine1 our = null;
    private static int limit;

    private CoffeeMachine1() {
        limit = 1;
        coffee = 1;
        water = 1;
    }

    static CoffeeMachine1 getInstance() {
        if (our == null) {
            if(limit>=0)
            our = new CoffeeMachine1();
            limit--;
        }
        return our;
    }
}

public class SingleTonClass {
    public static void main(String[] args) {
        CoffeeMachine1 c1 = CoffeeMachine1.getInstance();
        CoffeeMachine1 c2 = CoffeeMachine1.getInstance();
        CoffeeMachine1 c3 = CoffeeMachine1.getInstance();
        CoffeeMachine1 c4 = CoffeeMachine1.getInstance();
        CoffeeMachine1 c5 = CoffeeMachine1.getInstance();
        CoffeeMachine1 c6 = CoffeeMachine1.getInstance();
        System.out.println(c1 + "  " + c2 + "  " + c3 + " " + c4 + " " + c5 + " "+c6);
        if (c1 == c2&&c3==c4) {
            System.out.println("same");
        }
    }
}
