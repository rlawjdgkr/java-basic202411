package chap1_9.final_;

public class Student {
    public String name; //학생명
    //final을 사용시 내부에서도 변경 불가능 외부에서도 변경 불간으
    public final String ssn; //주민번호

    // 상수는 불변성과 유일성을 만족해야 함.
    // 따라서 final키워드는 불변성은 만족하나 유일성을 만족하지 못함.
    //psf = public static final

    public final String nation = "한국";    // 생성자를 초기화 하지 않으면 final변수의 값을 대입해야함



    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
