package class7.interface1;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
