package class6;

public class SingleInheritanceMain {
    public static void main(String[] args) {
        SingleInheritanceChild child = new SingleInheritanceChild();
        child.number=500;
        child.addition(120, 350);
        child.subtraction(980, 150);
        child.multiply(500, 100);

        AnyOne anyOne=new AnyOne();
        anyOne.number=500;
        anyOne.addition(120, 350);
        anyOne.subtraction(980, 150);
        anyOne.multiply(500, 100);
    }
}
