package class6;

public class MultilevelInheritanceMain  {
    int number;

    public static void main(String[] args) {
        MultilevelInheritanceRoot root = new MultilevelInheritanceRoot();
        root.subtraction(400, 100);
        root.addition(420, 230);

        System.out.println("================================");
        MultilevelInheritanceParent parent = new MultilevelInheritanceParent();
        parent.addition(987, 456);
        parent.subtraction(852, 369);
        parent.multiply(987, 10);

        System.out.println("================================");
        MultilevelInheritanceChild child = new MultilevelInheritanceChild();
        child.addition(987, 456);
        child.subtraction(852, 369);
        child.multiply(987, 10);
        child.divide(900, 20);

    }
}
