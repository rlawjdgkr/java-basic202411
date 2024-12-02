package chap1_7.inherit.example.bank;

public class Main{
    public static void main(String[] args) {
        SavingAccount a001 = new SavingAccount("A001", 5000, 1);

        a001.deposit(10000);
        a001.withdraw(10);
        a001.displayBalance();
    }
}
