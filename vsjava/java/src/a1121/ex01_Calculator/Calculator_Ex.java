package a1121.ex01_Calculator;

public class Calculator_Ex {
    public static void main(String[] args) {
        
        // 계산기 객체를 생성
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double x = 10.25;
        double y = 5.4;
        int arr[] = {1,2,3,4,5};

        int plus = calculator.plus(a,b);
        int minus = calculator.minus(a,b);
        double multiple = calculator.multiple(x,y);
        double divide = calculator.divide(x,y);
        int sum = calculator.sum(arr);
        double avg = calculator.avg(arr);

        System.out.println("덧셈 : " + plus);
        System.out.println("뺄셈 : " + minus);
        System.out.println("곱셈 : " + multiple);
        System.out.println("나눗셈 : " + divide);
        System.out.println("배열 합계 : " + sum);
        System.out.println("배열 평균 : " + avg);

        // printf("포맷(형식), 변수") : %X.Y(리터럴)
        // 형식기호를 사용하여 값을 형식에 따라 표현하는 메서드
        // X:양수 - 크기만큼 칸을 지정하고 오른쪽 정렬
        //  :음수 - 크기만큼 칸을 지정하고 왼쪽 정렬
        // Y:지정한 크기만큼의 소숫점 자리수를 나타낸다.(반올림된다.)
        // (리터럴): %d(정수), %f(실수), %s(문자열)
        // ex) printf("%d , %d", a, b);
        // ----> 출력 : 10 | 20

        System.out.println("========================");
        System.out.printf("multiple : %10.2f\n",multiple);
        System.out.printf("divide : %5.2f\n",divide);
    }
}
