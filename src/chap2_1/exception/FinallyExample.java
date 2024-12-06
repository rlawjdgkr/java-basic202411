package chap2_1.exception;

public class FinallyExample {
    public static void main(String[] args) {

        String[] pets = {"멍멍이", "야옹이","비둘기"};

        for (int i = 0; i < 4; i++) {

            try {
                System.out.println(pets[i] + "키울래요~");

            } catch (Exception e) {
                System.out.println("그런 애완동물은 없어요");
            }finally {
                System.out.println("애완동물 화이팅!");   //예외가 안나도 실행 예외가 나도 실행하는 코드

            }

        }
    }
}
