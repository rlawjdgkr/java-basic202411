package chat1_6;

import java.util.Scanner;

public class LibraryMember {


    public String memberId;
    private String name;
    private int borrowedBooks;
    // 기본 생성자 : 파라미터가 없는 생성자
    // 클래스 안에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어짐

    public LibraryMember() {   //기본 생성자
    }

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
       // this.borrowedBooks = 0;   굳이 세팅하지 않아도 0으로 기본값 초기화
    }
   public void borrowBook() {
       if (borrowedBooks < 5) {
           borrowedBooks++;
           System.out.printf("%s님이 책을 한 권 빌렸습니다. 현재 빌린 책의 수%d\n", name, borrowedBooks);
       } else {
           System.out.printf("%s님은 이미 5권의 책을 빌려습니다 더이상 빌릴 수 없습니다\n", name);
       }
   }
       public void returnBook(){
           if(borrowedBooks > 0){
               borrowedBooks--;
               System.out.printf("%s님이 책을 한 권 반납했습니다. 현재 빌린 책의 수%d\n",name,borrowedBooks);
           }else{
               System.out.printf("%s님은 더이상 반납할 책이 없습니다\n", name);
           }
    }
    void displayMemberInfo(){
        System.out.println("회원 " +memberId);
        System.out.println("\n회원이름 " +name);
        System.out.println("\n빌린 책 수 " + borrowedBooks);
    }
}
