package chap2_4.collection.list;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Integer> studentNumber = new ArrayList<>();
        studentNumber.add(85);
        studentNumber.add(90);
        studentNumber.add(78);
        studentNumber.add(88);
        studentNumber.add(76);
        
        int sum = 0;
        for (int i = 0; i < studentNumber.size(); i++) {
                sum += studentNumber.get(i);
        }
        System.out.println("sum = " + sum);
    }
}
