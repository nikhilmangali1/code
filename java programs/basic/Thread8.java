import java.util.Random;

class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int randomNumber = random.nextInt(100);
            System.out.println("Generated number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                new SquareCalculator(randomNumber).start();
            } else {
                new CubeCalculator(randomNumber).start();
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class Thread8 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }
}