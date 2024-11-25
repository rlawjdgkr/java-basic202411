package chap1_3;

//설계도 작성
public class BankAccount {
    //속성
    //계좌번호
    int accountNumber;
    //소유자
    String owner;
    //잔고
    int balance;

    void deposit(double amount){
        balance += amount;
        System.out.printf("%f가 입금되었습니다",amount);
    }
    void withdraw(double amount){
       if(balance < amount){
           System.out.println("잔액부족");
           return;
       }
       if(balance < amount){

           System.out.printf("%f금액 인출" ,amount);
       }
    }
    void displayBalance(){

        System.out.printf("잔액은 %d입니다",balance);
    }
}
