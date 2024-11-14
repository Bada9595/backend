package a1114;

public class Condi1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(score + "점은 " + grade + "등급입니다.");

        int a = 0;
        String age = (a >= 20) ? "성인" : (a >= 13) ? "청소년" : "어린이";
        System.out.println(a + "세는 " + age + "입니다.");
    }
}
