package class6;

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {

        HierarchicalInheritanceChild1 child1 = new HierarchicalInheritanceChild1();
        child1.number = 12;
        child1.multiply(10, 20);
        child1.addition(50, 30);
        child1.subtraction(951, 357);

        HierarchicalInheritanceChild2 child2 = new HierarchicalInheritanceChild2();
        child2.number = 123;
        child2.addition(50, 30);
        child2.subtraction(951, 357);
        child2.divide(645, 5);

    }
}
