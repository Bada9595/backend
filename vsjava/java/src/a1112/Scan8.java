package a1112;

import java.util.Scanner;

// 두 개의 문자를 입력받은 후 순서를 바꿔 출력해보자.

// 입력
// 두 개의 문자가 차례대로 입력된다.

// 출력
// 입력한 두 문자의 순서를 바꿔 출력한다.

// 입력 예시
// A
// b

// 출력 예시
// b A

public class Scan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a 값 입력: ");
		String a = scanner.next();
		
		
		System.out.print("b 값 입력: ");
		String b = scanner.next();
		

        System.out.print(b+""+a);
    }
}
