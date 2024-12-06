package chap2_1.exception;
import java.util.Scanner;

public class DivisionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            // 0으로 나누는 경우 ArithmeticException 발생
            int result = num1 / num2;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        }
        catch (NumberFormatException e){
            System.out.println("정수 말고 다른 데이터를 입력할 수 없어요");
        }
        finally {
            System.out.println("프로그램이 종료됩니다.");
            scanner.close(); // 자원 해제
        }
    }
}
