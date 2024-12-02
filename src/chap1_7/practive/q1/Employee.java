package chap1_7.practive.q1;

public class Employee {
    public String name;
    protected double salary; //급여
    /*
        {
            name'',
            salary: 0.0,
            foo: () =>{}
        }

     */

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+ "님이 일반 직원을 일합니다");
    }

    public double getSalary(){
        return salary;
    }

}
