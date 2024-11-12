package a1112;

import java.util.Scanner;

public class Scan3 {
    public static void main(String1[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름입력 : ");
        String name = scan.nextLine(); //문자열입력.
        System.out.print("나이입력 : "); //print : 줄바뀜없음.
        int age = scan.nextInt();

        System.out.println("Name : " + name); //println : 줄바뀜.
        System.out.println("Age : " + age);
    }
}
