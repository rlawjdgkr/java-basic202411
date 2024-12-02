package chap1_7.practive.q5;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD12345", 50000);
        OnlineOrder onlineOrder = new OnlineOrder("ORD98765", 70000, 4000);
        order.process();

        onlineOrder.process();
        double totalAmount = onlineOrder.calculateTotalAmount();
        System.out.println("totalAmount" + totalAmount);
    }
}
