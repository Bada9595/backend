package a1114;

public class Switch5 {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;
        switch(grade){
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;    
        }
        System.out.println("score1: " + score1);

        int score2 = switch(grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
        //단일 라인 케이스는 -> 함께 직접값을 반환.
        //여러줄 블록에서는 yield를 사용하여 값을 반환. Java 13부터 가능!
    }
}
