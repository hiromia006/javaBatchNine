package class7.polymopign;

public class OverrideMain {
    //  new ClassName()
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();

        Cat cat = new Cat();
        cat.animalSound();

        Animal cat2=new Cat();
        cat2.animalSound();

        Animal animal = new Animal();
        animal.animalSound();


    }
}
