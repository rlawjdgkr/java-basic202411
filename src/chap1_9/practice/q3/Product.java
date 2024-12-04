package chap1_9.practice.q3;

public class Product {
    private  String productName;
    private double price;
    private static final double DISCOUNT_RATE = 0.1;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void getProductInfo(){
        System.out.println("productName = " + productName);
        System.out.println("price = " + price);

    }
    public void getDiscountedPrice(){
        double disCountPrice = price - (price * DISCOUNT_RATE);
        System.out.println("할인된 가격 " + price);
    }
}
