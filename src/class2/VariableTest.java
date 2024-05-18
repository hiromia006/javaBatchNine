package class2;

public class VariableTest {
    long studentId;
    static String departmentName = "CSE";


    public void printDepartmentName() {
        String studentName = "Karim";
        System.out.println(studentName + " department name " + departmentName+ "id "+studentId);
    }

    public void printMark() {
        int mark = 80;
        System.out.println("Mark " + mark);
    }

    public static void main(String[] args) {
        System.out.println(VariableTest.departmentName);

        VariableTest test=new VariableTest();
        test.studentId=202401001;
        test.printMark();
        test.printDepartmentName();

        VariableTest test2=new VariableTest();
        test2.studentId=202401002;
        test2.printMark();
        test2.printDepartmentName();
    }
}
