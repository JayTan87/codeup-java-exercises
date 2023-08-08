package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student jeremy = new Student("Jeremy");

        jeremy.addGrade(90);
        jeremy.addGrade(85);
        jeremy.addGrade(100);
        jeremy.addGrade(80);
        jeremy.addGrade(95);
        jeremy.addGrade(87);

        System.out.println(jeremy.getGradeAverage());
    }
}
