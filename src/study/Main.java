package study;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("동물");
        Dog dog = new Dog("강아지");
        Cat cat = new Cat("cat");

        dog.sound();
        cat.sound();
    }
}
