package class5;

public class ForLoopTest {
    public static void main(String[] args) {

//        //increment
//        for (int i = 0; i < 50; i += 10) {
//            System.out.println(i);
//        }
//        System.out.println("===============================");
//        //decrement
//
//        for (int j = 10; j >= 0; --j) {
//            System.out.println(j);
//        }
//
//        System.out.println("===============================");
//        int account = 0;
//        for (; account < 5; ) {
//            account++;
//            System.out.println(account);
//
//        }

        //for each loop
        int[] numbers = {50, 30, 25, 84, 99};
//        for (int num : numbers) {
//            System.out.println(num);
//        }
//
//        System.out.println("=====================");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }


        //while loop

//        int i = 0;
//        while (i < 6) {
//            System.out.println(i);
//            i++;
//        }

        //Do While
        System.out.println("=======================");
//        int j = 10;
//        do {
//            System.out.println(j);
//            --j;
//        } while (j >= 6); //10,9,8,7,6


        //jumping
        String names[] = {"kabir", "ragib", "Zim", "Afroza"};
        for (String name : names) {
            if (name.equals("Zim")) break;
            System.out.println(name);
        }
        System.out.println("=======================");
        for (int l = 0; l < 10; l++) {
            if (l == 5) continue;
            System.out.println(l);
        }
    }
}
