package a1112;

public class Operater {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1:" + result1);

        byte v1 = 10;
        byte v2 = 10;
        int result2 = v1 + v2; //int 타입으로 변환 후 연산
        System.out.println("result:" + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5; //long 타입으로 변환 후 연산
        System.out.println("result3:" + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7; //int 타입으로 변환 후 연산 65 + 1
        System.out.println("result4:" + result4);
        System.out.println("result4:" + (char)result4);
        //66을 아스키 코드로 바꾸면 B

        int v8 = 10;
        int result5 = v8 / 4; //정수 연산의 결과는 정수
        System.out.println("result5:" + result5);

        int v9 = 10;
        double result6 = v9 / 4.0; //double타입으로 변환 후 연산
        System.out.println("result6:" + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double)v10 / v11; //double타입으로 변환 후 연산
        System.out.println("result7:" + result7);


    }
}