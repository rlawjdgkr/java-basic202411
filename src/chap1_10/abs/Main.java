package chap1_10.abs;

public class Main {
    public static void main(String[] args) {
 //        Pet pet = new Pet(); //추상적인 객체

        Dog mydog = new Dog();
        Cat mycat = new Cat();
        GoldFish goldFish = new GoldFish();
        Pet[] petList ={mycat,mydog,goldFish};
        for (Pet pet : petList) {
            pet.eat();
        }
    }
}
