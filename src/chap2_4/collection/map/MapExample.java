package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        // 데이터 추가 : put
        map.put("empName","김철수");
        map.put("hireDate", LocalDate.of(2012,3,15));
        map.put("salary",50000);

        System.out.println(map);

        // 맵에 있는 데이터 꺼내기
        String empName =(String) map.get("empName");
        System.out.println("empName = " + empName);

        Integer salary = (Integer) map.get("salary");
        System.out.println("salary = " + salary);
    }
}
