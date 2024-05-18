package class7.abtraction;

public class AbtractMain {
    public static void main(String[] args) {
        //Animal animal=new Animal();
        Cat cat = new Cat();
        cat.animalSound();
        cat.sleep();
        cat.eat();
        cat.color = "black";
        cat.legNumbers = 4;

        //  ParentClass variable=new Child();
        // Webdriver driver=new FirefoxDriver();
        Animal cat2 = new Cat();
        cat2.animalSound();
        cat2.sleep();
        cat2.legNumbers = 5;

    }
}
