package chat1_6;

import java.util.Scanner;

public class LibraryMember {


    public String memberId;
    private String name;
    private int borrowedBooks;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
   private void borrowBook(int borrowedBooks){
        this.borrowedBooks += borrowedBooks;

        if( borrowedBooks >= 5){
            System.out.println("5권 이상은 빌릴 수 없습니다");
            return;
        }
        System.out.printf("%d권 빌렸습니다",borrowedBooks);
    }
    void displayMemberInfo(){
        borrowBook(10);
        System.out.println("회원 " +memberId);
        System.out.println("\n회원이름 " +name);
        System.out.println("\n빌린 책 수 " + borrowedBooks);
    }
}
