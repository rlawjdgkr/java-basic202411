package chap1_9.enum_;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.orderPizza();
        //현재 주문 상태
        pizza.readyPizza();
        System.out.println("주문상태" + pizza.getStatus());
        pizza.deliverPizza();
    }
}
