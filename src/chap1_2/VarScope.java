package chap1_2;

public class VarScope {
    public static void main(String[] args) {
        // java는 변수가 선언된 중괄호(블록)에서 태어나서
        // 블록이 끝나는 부분에서 소멸한다.
        int x1 = 10;
        if(true){                   //script처럼 무한루프 안에 똑같은 변수 객체 생성 불가능

        }
        System.out.println("x1 = " + x1);

    }
    int x2 = 10;
}
