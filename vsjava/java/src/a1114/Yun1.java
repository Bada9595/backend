package a1114;

import java.util.Scanner;

// ☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...
// ☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...
// ☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...
// 예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다. 
// 이를 알면 조건문을 활용하여 코드화하는 것은 쉽다. 두 가지 알고리즘을 생각해보았다.
public class Yun1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("년도를 입력하세요:");
       int year = scan.nextInt();
       if(year % 4 == 0){
        if(year % 400 == 0 && year % 100 == 0){
            System.out.println(year+"년도는 윤년이 아닙니다.");
        }else{
            System.out.println(year+"년도는 윤년입니다.");
        }
       }else{
        System.out.println(year+"년도는 윤년이 아닙니다.");
       }
    }
}
