package a1113;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //정수 세개를 입력 받아 합과 평균을 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하시오: ");
        int num1 =scan.nextInt();
        System.out.print("두번째 정수를 입력하시오: ");
        int num2 =scan.nextInt();
        System.out.print("세번째 정수를 입력하시오: ");
        int num3 =scan.nextInt();

        System.out.println("정수 세개의 합계 : " + (num1+num2+num3));
        System.out.println("정수 세개의 평균 : " + (num1+num2+num3)/3);
    }
}

