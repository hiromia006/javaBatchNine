package class7.abtraction;

public class Cat extends Animal {
    public String color;

    @Override
    public void animalSound() {
        System.out.println("The dog says: Moe Moe");
    }

    public void eat() {
        System.out.println("Cat eats milk & Fish");
    }
}
