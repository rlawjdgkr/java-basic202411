package chap2_4.collection.set;

import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        // HashSet<변수타입> 변수명 = new HashSet<>();
        HashSet<Integer> studentId = new HashSet<>();
        studentId.add(101);
        studentId.add(102);
        studentId.add(103);
        studentId.add(102);
        boolean contains = studentId.contains(101);
        System.out.println("contains = " + contains);
        System.out.println("studentId = " + studentId);
        

    }
}
