package chap1_7.inherit.example.employee;

public class Manager extends Employee{
    private double bonus; //보너스 금액

    public Manager(String name, int salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    void work(String name) {
        System.out.println(name +"님이 관리자 팀을 관리합니다");
    }

    }

