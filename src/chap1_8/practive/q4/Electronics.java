package chap1_8.practive.q4;

public class Electronics extends Product{
    private String model;
    private double basePrice; // 기본가격
    private double taxRate;

    public Electronics(String model, double basePrice, double taxRate) {
        this.model = model;
        this.basePrice = basePrice;
        this.taxRate = taxRate;
    }

    @Override
    public double calculatePrice() {
        return basePrice * taxRate;
    }
}
