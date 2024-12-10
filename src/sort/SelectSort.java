package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {

    int[] number = {2,14,8,55,4,1};
        for (int i = 0; i < number.length-1; i++) {
            int min = number[i];
            for (int j = i+1; j < number.length; j++) {
                if (min > number[j]) {
                    int temp = number[j];  //작은값을 temp에 저장
                    number[j] = number[i]; // i값을 j에 저장
                    number[i] = temp;  //작은 값을 i에 넣기
                }
            }
        }
        System.out.println(Arrays.toString(number));

    }


}
