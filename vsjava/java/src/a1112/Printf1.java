package a1112;

public class Printf1 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        //1. %d는 정수형(int) 값을 출력하는 서식 지정자입니다.
        System.out.printf("상품의 가격: %6d원\n", value);
        //2. %6d는 최소 6자리 공간을 확보하여 int 값을 출력합니다. 
        //   값이 6자리보다 적으면 공백으로 남은 자리를 채웁니다.
        System.out.printf("상품의 가격: %-6d원\n", value);
        //3. %-6d는 6자리 공간을 확보하면서 왼쪽 정렬을 합니다. 즉, 123 뒤에 공백이 추가됩니다.
        System.out.printf("상품의 가격: %06d원\n", value); 
        //4. %06d는 6자리 공간을 확보하고, 자리가 모자라면 0으로 채운다는 의미입니다. 

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
        // %d는 정수를 출력합니다. 여기서는 10을 출력합니다.
        // %10.2f는 실수(float 또는 double) 값을 출력하는 서식 지정자입니다. 
        // 10은 전체 자리 수, .2는 소수점 이하 두 자리까지 출력한다는 의미입니다.
        // area는 원의 넓이를 계산한 값인 314.159입니다. 소수점 이하 두 자리까지 출력하면 314.16이 됩니다.
        // 이 값은 10자리 공간에 맞춰 출력됩니다.

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n",1, name, job);
        // %6d는 정수 1을 6자리 공간에 출력하고, 오른쪽 정렬됩니다.
        // %-10s는 문자열 name을 왼쪽 정렬하여 10자리 공간에 출력합니다.
        // %10s는 문자열 job을 오른쪽 정렬하여 10자리 공간에 출력합니다.
    }
}
// printf는 서식 지정자(format specifier)를 통해 출력 형식을 제어할 수 있습니다.



