package study.moreStudy;


public class Dog extends Animal {

    public Dog(String name , int age){
        super(name,age);
    }
    public void sound(){
        System.out.println("Woof! Woof!");
    }
    public void fetch(){
        System.out.println("Fetching the ball");
    }
}
