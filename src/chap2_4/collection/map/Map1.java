package chap2_4.collection.map;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String,Integer> studentInfo =  new HashMap<>();
        studentInfo.put("Alice", 20);
        studentInfo.put("Bob", 22);
        studentInfo.put("Charlie", 21);

        int aliceAge = studentInfo.get("Alice");    //HashMap에는 Integer지만 저장되어있는 alice값을 불러올 때는 오토 언박싱 동작을 할 수 있음

        System.out.println("aliceAge = " + aliceAge);
    }
}
