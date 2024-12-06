package chap2_4.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class q1 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("홍길동");
        student.add("이순신");
        student.add("강감찬");
        student.add("홍길동");
        HashSet<String> uniqueName = new HashSet<>(student);
        System.out.println("uniqueName = " + uniqueName);
    }
}
