package class2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int number1 = 66, number2 = 99;

        System.out.println(number1 != number2); //true
        System.out.println(number1 == number2); //false
        System.out.println(number1 > number2); //false
        System.out.println(number1 < number2); // true
        System.out.println(number1 >= number2);//false
        System.out.println(number1 <= number2); //true
        System.out.println("===============================================");
        number1 = 99;
        number2 = 66;
        System.out.println((number1 != number2) && number1 <= number2);//false
        System.out.println((number1 != number2) && (number1 >= number2));//true
        System.out.println((number1 == number2) || number1 <= number2);//false
        System.out.println((number1 == number2) || number1 >= number2);//true
    }
}
