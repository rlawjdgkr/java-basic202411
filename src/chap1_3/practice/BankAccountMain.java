package chap1_3.practice;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount kim = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        kim.deposit(2000);
        kim.deposit(2000);
        kim.withdraw(9000);

        kim.transfer(yourAccount, 3000);
        System.out.println("=============나의 잔액==========");
            kim.displayBalance();
        System.out.println("===========상대방의 잔액============");
            yourAccount.displayBalance();
    }
}
