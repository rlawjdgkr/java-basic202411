package chap1_7.inherit.example.employee;

public class Employee {
    public String name; //직원 이름
    public double salary;  //급여

    //이름과 급여를 초기화하는 생성자
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work(String name){
        System.out.printf("%s 직원이 일합니다", name);
    }
        double getSalary() {
            return salary;
        }
}
