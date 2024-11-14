package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요:");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자를 입력하세요:");
        int num3 = scan.nextInt();

        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("가장 큰 숫자는 " + max +" 입니다.");

       
    }
}
