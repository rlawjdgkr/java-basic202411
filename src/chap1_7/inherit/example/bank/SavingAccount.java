package chap1_7.inherit.example.bank;

public class SavingAccount extends BankAccount{
    private double interestRate; //이자율

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * interestRate;
            super.deposit(amount + interest);
            System.out.printf("이자가 %.2f원 추가되었습니다 \n" , interest);
        }
    }
    // 예금 기능
}
