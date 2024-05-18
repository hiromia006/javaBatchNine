package class3;

public class Person {
    public String name;
    public String gender;
    public float height;

    public Person() {

    }


    public Person(String name, String gender, float height) {
        this.name = name;
        this.gender = gender;
        this.height = height;

    }

    public void speak(String name) {
        System.out.println(name + "  speak");
    }

    public void work() {
        System.out.println("All are equal " + gender);
    }

    public static void main(String[] args) {
        Person hasibul = new Person();
        hasibul.name = "Hasibul";
        hasibul.gender = "Male";
        hasibul.height = 5.71f;
    }


}
