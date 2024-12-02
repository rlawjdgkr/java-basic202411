package study.moreStudy;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
    public void climb(){
        System.out.println("Climbing a tree!");
    }
}
