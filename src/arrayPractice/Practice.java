package arrayPractice;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        int[] numbers ={1,3,5,7,9};
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//            System.out.println(sum);

//        int[] numbers = {5, 10, 15 , 20, 25};
//
//        for (int number : numbers) {
//            if(number % 2 == 0 ){
//                System.out.println(number);
//            }
//        }
//        int[] numbers = {5, 3, 8, 1, 2};
//
//
//        // n번째 배열과 n+1번째 배열의 수를 비교해 작으면 교환
//        int temp = 0;
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - 1 - i; j++) {
//                //j가 j+1보다 큰경우
//                if (numbers[j] > numbers[j + 1]) {
//                    //temp에 number의 j배열 추가
//                    // j가 5면 temp에 5추가 temp = 5
//                    temp = numbers[j];
//                    //3을 0번 인덱스에 추가 : 3,3,8,1,2
//                    numbers[j] = numbers[j + 1];
//                    //j+1에 5를 추가 현재 j+1 = 3 -> 3,5,8,1,2
//                    numbers[j+1] = temp;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }
        int[] numbers = {64, 25, 12, 22, 11};

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i; // 현재 위치를 가장 작은 값의 초기값으로 설정

            // 현재 위치 이후에서 가장 작은 값을 찾음
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j; // 더 작은 값이 있으면 minIndex 업데이트
                }
            }

            // 가장 작은 값과 현재 위치를 교환
            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

// 정렬된 배열 출력
        System.out.println(Arrays.toString(numbers));

    }
    }



