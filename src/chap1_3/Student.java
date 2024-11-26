package chap1_3;

//설계도
public class Student {
    int studentId;  //학생id
    String name;   //학생이름
    int grade;     //학년

    void updateGrade(int newGrade){
        grade = newGrade;
    }
    //생성자 정의
    Student(int dStudentId ,String dName, int dGrade){
        studentId = dStudentId;
        name = dName;
        grade = dGrade;
    }
    void printStudentInfo(){
        System.out.printf("학생아이디:%d\n ,학생이름:%s\n ,학년:%d\n",studentId, name,grade);
    }
}
