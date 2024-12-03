package a1125.object;

public class Main1 {
    public static void main(String[] args) {
        // MemberService 객체 생성
        MemberService memberService = new MemberService();

        // 로그인 시도
        boolean result = memberService.login("hong", "12345");

        // 로그인 성공 여부에 따라 메시지 출력
        if (result) {
            System.out.println("로그인 되었습니다.");
            // 로그인 성공 시 로그아웃 메소드 호출
            memberService.logout("hong");
        } else {
            System.out.println("ID 또는 password가 올바르지 않아요.");
        }
    }
}

// 로그인과 로그아웃을 처리하는 MemberService 클래스
class MemberService {
    private String id;
    private String password;

    // 로그인 메소드: 입력된 ID와 비밀번호가 맞는지 확인
    public boolean login(String id, String pass) {
        if (id.equals("hong") && pass.equals("12345")) {
            this.id = id; // ID 저장
            this.password = pass; // 비밀번호 저장
            return true; // 로그인 성공
        } else {
            return false; // 로그인 실패
        }
    }

    // 로그아웃 메소드: 로그아웃 처리
    public void logout(String id) {
        if (this.id != null && this.id.equals(id)) {
            System.out.println(id + "님이 로그아웃 되었습니다.");
            this.id = null; // 로그인 정보 초기화
            this.password = null; // 비밀번호 초기화
        } else {
            System.out.println("로그인된 사용자가 아닙니다.");
        }
    }
}
