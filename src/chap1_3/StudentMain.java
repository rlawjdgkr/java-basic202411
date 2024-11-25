package chap1_3;

public class StudentMain {
    public static void main(String[] args) {

        Student kim = new Student(123,"김정학",3);
        kim.updateGrade(2);
        kim.printStudentInfo();
    }
}
