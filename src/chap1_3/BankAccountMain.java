package chap1_3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount kim = new BankAccount();
        kim.deposit(30000);
        kim.withdraw(20000);
        kim.displayBalance();
    }
}
