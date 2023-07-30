package ques;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService ms = new MemberService();

        boolean result = ms.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            ms.logout("hong");
        } else {
            System.out.println("id나 password가 올바르지 않거나 입력되지 않았습니다.");
        }
    }
}