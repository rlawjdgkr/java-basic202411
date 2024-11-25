package chap1_3;
//설계자
public class Rectangle {
    int width;
    int height;

    //사각형의 넓이를 계산하여 반환하는 메서드
    void calculateArea(){
        System.out.printf("가로%d,세로%d인 사각형의 넓이는 %d입니다\n",width,height,width*height);
    }
    //사각형의 둘레를 구하는 공식
    void calculatePerimeter(){
        System.out.printf("가로%d,세로%d인 사각형의 둘레는 %d입니다",width,height,(width+height)*2);
    }
    Rectangle(int nWidth , int nHeight){
        width = nWidth;
        height = nHeight;
    }
}
