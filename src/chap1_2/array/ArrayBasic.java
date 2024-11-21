package chap1_2.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        /*
            
            배열의 특징
            1. 동종 모음 구조 : 같은 타입의 데이터만 저장 가능
            2. 크기가 불변함: 크기를 동적으로 늘이거나 줄일 수 없음
                    
         */
        //배열 만들기
        //1. 배열 변수 만들기
        int[] numbers;   //int 배열 타입 , numbers의 메모리 할당용량 -> 8바이트 
        //2. 배열 생성하기
        numbers = new int[5];
        System.out.println("numbers = " + numbers);
        // 3. 배열 값 초기화 - 인덱스 사용
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;  //casting으로 가능
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;
//        numbers[5] = 7;    //배열 5개짜리이므로 6개는 들어올 수 없음

        //4. 배열 값 확인하기
        System.out.println(Arrays.toString(numbers));

        //배열 길이 확인하기
        System.out.println(numbers.length);

        System.out.println("====================================");

        // 배열의 순회
        for (int i = 0; i < numbers.length ; i++) {
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
            System.out.printf("numbers[%d]: %d\n, ", i, numbers[i]);
        }
        System.out.println("=======================");
        
        //배열 전용 반복문: foreach, inhanced for loop
        //iter

        }
       }
        
    }

