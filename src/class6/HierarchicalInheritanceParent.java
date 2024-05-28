package class6;

public class HierarchicalInheritanceParent {
    int number;

    public void addition(int number1, int number2) {
        number = number1 + number2;
        System.out.println("The sum of the given numbers:" + number);
    }

    public void subtraction(int number1, int number2) {
        number = number1 - number2;
        System.out.println("The difference between the given numbers: " + number);
    }
}
