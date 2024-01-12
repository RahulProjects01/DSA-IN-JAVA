class Calculator {
    public double add(int a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a - b;
    }

    public double add(float a, int b) {
        return a * b;
    }

    public double add(double a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0 ;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double add = c.add(10, 20);
        double sub = c.add(30, 22.00);
        double mult = c.add(2.00f, 10);
        double divide = c.add(20.00, 2);
        System.out.println("Addition: " + add);
        System.out.println("Subtract: " + sub);
        System.out.println("Multiply: " + mult);
        System.out.println("Divide: " + divide);
    }
}