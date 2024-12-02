package chap1_7.inherit.example.calculator;

public class ScientificCalculator extends Calculator{
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }


    public double power(double base , double exponent){
        return Math.pow(base, exponent);
    }

}
