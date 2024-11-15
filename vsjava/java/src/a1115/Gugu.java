package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 단을 입력하세요:");
        int input = scan.nextInt();

        for(int i = 1; i <=9; i++){
            // System.out.println(input+" * " +i+ " = "+input * i);
            int result = input * i;
            System.out.println(input+" * "+i+" = "+result);
        }
        scan.close();
    }
}
