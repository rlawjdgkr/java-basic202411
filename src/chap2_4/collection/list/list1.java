package chap2_4.collection.list;

import java.util.ArrayList;

public class list1 {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Alice");
        studentName.add("Bob");
        studentName.add("Charlie");
        studentName.add(1,"David");
        studentName.remove("Bob");
        System.out.println("studentName = " + studentName);
    }
}
