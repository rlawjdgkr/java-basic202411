package chap1_3;

public class StudentMain {
    public static void main(String[] args) {

        Student kim = new Student(123,"김철수",3);
        kim.updateGrade(2);
        kim.printStudentInfo();

        Student park = new Student(456,"박영희",1);
        park.updateGrade(3);
        park.printStudentInfo();
    }
}
