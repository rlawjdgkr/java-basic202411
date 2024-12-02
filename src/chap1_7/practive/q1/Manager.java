package chap1_7.practive.q1;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name, salary); //부모 클래스 생성자 호출
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(this.name + "님이 관리자로 팀을 관리합니다 ");
    }
    public double getTotalCompensation(){
        return bonus + salary;
    }
}
