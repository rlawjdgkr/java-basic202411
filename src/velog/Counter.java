package velog;

class Counter {
    static int count = 0;  // static 변수: 모든 객체에서 공유됨

    public Counter() {
        count++;  // 객체가 생성될 때마다 count 증가
    }

    public static void displayCount() {
        System.out.println("객체의 개수: " + count);
    }
}

