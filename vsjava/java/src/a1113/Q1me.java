package a1113;

import java.util.Scanner;

public class Q1me {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("첫번째 정수를 입력하세요: ");
       int a = scan.nextInt();
       System.out.print("두번째 정수를 입력하세요: ");
       int b = scan.nextInt();

       int result1 = a + b;
       int result2 = a - b;
       int result3 = a * b;
       int result4 = a / b;
       int result5 = a % b;

       System.out.println("a + b = " + result1);
       System.out.println("a - b = " + result2);
       System.out.println("a * b = " + result3);
       System.out.println("a / b = " + result4);
       System.out.println("a % b = " + result5);

    }
}
