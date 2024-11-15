package a1112;

public class FloatDouble {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
// 과학적 표기법
// a x 10^b
// a는 유효숫자, 일반적으로 1이상 10미만 숫자
// b는 지수, 10을 몇 번 곱하거나 나누어야 하는지 나타낸다.
// 3e6은 3 * 10^6, 즉 3000000을 의미합니다.
// 3e6f는 float 타입으로 표현된 과학적 표기법입니다.
// 2e-3은 2 * 10^-3, 즉 0.002를 의미합니다.
