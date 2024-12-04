package chap1_9.practice.q2;

public class Employee {
    private static int idCounter; // static 변수로 직원 ID 관리
    private int employeeId;
    private String name;

    public Employee(String name) {
        this.name = name;
        this.employeeId = ++idCounter;
    }
    public void getEmployeeInfo(){
        System.out.println("직원의Id = " + this.employeeId);
        System.out.println("직원의 이름: " +this.name);

    }

}
