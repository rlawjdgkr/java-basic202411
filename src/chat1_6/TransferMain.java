package chat1_6;

public class TransferMain {
        TransferAccount[] accountList;
    void memberRepository(){
        this.accountList = new TransferAccount[] {
          new TransferAccount(111222333,300000,"1234"),
          new TransferAccount(444555666,200000,"5678"),
          new TransferAccount(777888999,100000,"9101"),
        };
    }

    public static void main(String[] args) {
        TransferAccount mm = new TransferAccount(12345,20000,"5555");
        mm.withdraw(30000,"5555");
    }
}
