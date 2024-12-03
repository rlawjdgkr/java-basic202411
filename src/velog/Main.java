package velog;


import chap1_4.cake.Apple;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();  // count: 1
        Counter c2 = new Counter();  // count: 2
        Counter c3 = new Counter();  // count: 3

        Counter.displayCount();  // 객체 개수 출력: 3
    }
}
