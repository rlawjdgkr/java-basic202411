package study.moreStudy;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Dog dog = new Dog("강아지" ,12);
        Cat cat = new Cat("고양이" , 13);

        dog.sound();
        cat.sound();
        dog.fetch();
        cat.climb();


    }
}
