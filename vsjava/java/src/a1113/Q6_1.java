package a1113;

import java.util.Scanner;

public class Q6_1 {
    public static void main(String[] args) {
        //정수 세개를 입력 받아 합과 평균을 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하시오: ");
        int num1 =scan.nextInt();
        System.out.print("두번째 정수를 입력하시오: ");
        int num2 =scan.nextInt();
        System.out.print("세번째 정수를 입력하시오: ");
        int num3 =scan.nextInt();

        int sum = num1 + num2 + num3;
        // double avg = (double)sum / 3;

        System.out.println("합 : " + sum);
        // System.out.printf("평균 : %.1f\n", avg);
        System.out.printf("평균 : %.1f\n", (float)sum/3);
    }

}

