package a1114;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력 해보세요:");
        int m = scan.nextInt();

        if(m == 12 || m == 1 || m == 2){
            System.out.println("겨울 입니다.");
        }else if(m >= 3 && m <= 5){
            System.out.println("봄 입니다.");
        }else if(m >= 6 && m <= 8){
            System.out.println("여름 입니다.");
        }else if(m >= 9 && m <= 11){
            System.out.println("가을 입니다.");
        }
    }
}
