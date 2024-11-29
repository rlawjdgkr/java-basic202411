package chat1_6;


import java.util.Scanner;

public class TransferAccount {
    Scanner sc =  new Scanner(System.in);
    TransferAccount ac;
    public int accountNumber;
    private double balance;
    private String password;

    public TransferAccount(int accountNumber, double balance, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    // 잔고를 증가시키는 메서드
    void deposit(double amount){
        this.balance += amount;
        System.out.printf("잔고가 %lf 입니다", this.balance);
    }
    //회원 비밀번호가 일치시 잔고 금액을 인출
    void withdraw(double amount, String inputPassword){
        System.out.println("비밀번호를 입력하세요");
        System.out.printf(">>");
        String memberPassword = sc.nextLine();

        if(memberPassword.equals(ac.password)){
            System.out.println("인출이 완료되었습니다");
        }
        System.out.println("비밀번호가 틀립니다.");
    }

}
