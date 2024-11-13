package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println(number + "은(는) 짝수입니다.");
        }else{
            System.out.println(number + "은(는) 홀수입니다.");
        }
    }
}
