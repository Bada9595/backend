package a1119;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요:");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.print("배열 요소를 입력하시오:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // 합계와 평균 구하기
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double)sum / size;

        System.out.println();
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.2f\n" , avg); //소수점2자리까지 하고 줄바꾸겠다.
    }
}
