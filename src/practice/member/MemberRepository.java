package practice.member;

//회원 객체를 여러개 모아서 관리할 설계도
public class MemberRepository {

    Member[] memberList; //가입된 회원 배열

    MemberRepository(){
        //[10, 20, 30, 40]
        // 배열안에 객체를 집어넣는 방법 : 자바스크립트에서는 중괄호로 넣으면 되지만 자바에서는 new로 객체 생성
       this.memberList = new Member[] {
               new Member("abc123@def.com","1234","콩벌레",Gender.MALE,24),
               new Member("fff@ggg.com","5678","초코빵",Gender.FEMALE,30),
               new Member("xxx@ccc.com","9876","바보똥",Gender.MALE,7),
       };
    }
    //모든 회원 정보를 가져오는 메서드
    Member[] getMembers(){
        return this.memberList;
    }
    // 회원 목록에 새로운 회원 1명을 추가하는 메서드
    void addMember(Member newMember){
        //push

        Member[] temp = new Member[memberList.length + 1];//소괄호는 회원 한명만 대괄호는 여러명이 들어갈 공간
        for (int i = 0; i <memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length-1] = newMember;
        memberList = temp;
        // 숫자 배열 : [10, 20, 30, 40]
        // 객체 배열: [주소1, 주소2 ,주소3]
    }

     int getMemberCount(){
        return memberList.length;
    }

    /**
     * 이메일 중복 여부를 확인하는 메서드
     * @param targetEmail -이메일 검사 대상 문자열
     * @return -이메일이 중복이면 true 중복이 아니면 false
     */
    boolean isDuplicateEmail(String targetEmail){
        for (Member m : memberList) {
            if(targetEmail.equals(m.email)){
                return true;
            }
        }
            return false;
        }
    /**
     * 이메일을 통해 회우너 목록 배열에서 해당 이메일을 가진
     * 객체를 찾아 리턴하는 메서드
     * @param targetEmail - 탐색 대상의 이메일
     * @return - 이메일이 일치하는 회원을 반환, 일치하는 회원이 없다면
     *              null을 반환한다.
     *
     */
    Member findMemberByEmail(String targetEmail){
        for (Member m : memberList) {
            if(targetEmail.equals(m.email)){
                return m;
            }
        }
        return null;
    }

   //멤버를 한명 삭제하는 메서드

    void deleteMember(Member newMember){

        Member[] temp = new Member[memberList.length + 1];//소괄호는 회원 한명만 대괄호는 여러명이 들어갈 공간
        for (int i = 0; i <memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length-1] = newMember;
        memberList = temp;

    }
    //패스워드와 일치할시 true false
    boolean findMemberByPassword(String targetPassword){
        for (Member pw : memberList) {
            if(targetPassword.equals(pw.password)){
                return true;
            }
        }
        return false;
    }

}
