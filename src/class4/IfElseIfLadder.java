package class4;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int mark = 170;
        if (mark >= 80 && mark <= 100) {
            System.out.println("Grade is A++");
        } else if (mark >=70 && mark < 80) {
            System.out.println("Grade is A");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Grade is A-");
        } else if (mark >= 40 && mark < 60) {
            System.out.println("Grade is B");
        } else if (mark < 40) {
            System.out.println("Fail");
        }else {
            System.out.println("Fail");
        }
    }
}
