package study.moreStudy;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sound(){
        System.out.println("Generic animal sound");
    }
    public void eat(){
        System.out.println("Eating food");
    }
}
