package a1113;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
       int sum = 0;

       for(int i = 1; i <=100; i++){
        // System.out.print(i);
        sum += i; // sum = sum + i;
        // System.out.println("1부터 100 합 : " + sum); 중괄호 안에 넣어놓으면 1~100까지 더한 과정이 결과로 다 나옴.
       }
       System.out.println("1부터 100 합 : " + sum);
    // 중괄호 밖에 놔두면 1~100 더한 값만 결과에 나옴.
    }
}

