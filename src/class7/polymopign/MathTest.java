package class7.polymopign;

public class MathTest {
    int number;

    public void addition() {
        int number1 = 987, number2 = 150;
        number = number1 + number2;
        System.out.println(" Addition : " + number);
    }

    public void addition(int number1) {
        int number2 = 150;
        number = number1 + number2;
        System.out.println(" Addition : " + number);
    }

    public void addition(int number1, int number2) {
        number = number1 + number2;
        System.out.println(" Addition : " + number);
    }

    public static void main(String[] args) {
        MathTest test = new MathTest();
        test.addition();
        test.addition(500);
        test.addition(500, 900);
    }
}
