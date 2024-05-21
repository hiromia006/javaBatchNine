package class4;

public class MethodMainTest {
    public static void main(String[] args) {
        MethodTest.printName();
        MethodTest test = new MethodTest();
        System.out.println("Non Void Method " + test.divide());
        test.printNumber();
        System.out.println("Non Void Method with Parameter "+test.add(150,500));
    }
}
