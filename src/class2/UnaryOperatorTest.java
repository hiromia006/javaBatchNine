package class2;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        int mark=65;

        mark=mark+1;//++
        mark=mark-1;//--

        System.out.println(mark++);  // print:65, mark=65+1=66
        System.out.println(mark); //print: 66, mark=66
        System.out.println(--mark); //print:65 mark=mark-1=66-1=65
        System.out.println(mark); //print 65, mark=65
        System.out.println(mark--); //print:65 mark=mark-1=65-1=64
        System.out.println(++mark);//print:65 mark=mark+1=64+1=65
        System.out.println(mark); //print:65
    }
}
