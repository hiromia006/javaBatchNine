package class2;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int number1 = 66, number2 = 99;

        number1 += number2; //number1=number1+number2 165
        System.out.println(number1);

        number2 -= number1; // number2=number2-number1=99-165=-66
        System.out.println(number2);

        number1 *= number2; //number1=number1*number2=-66*165
        System.out.println(number1);//

        number2 /= 11;//
        System.out.println(number2);//-6

        number1 %= 7;
        System.out.println(number1);


    }
}
