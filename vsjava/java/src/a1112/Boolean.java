package a1112;

public class Boolean {
    public static void main(String1[] args) {
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        }else{
            System.out.println("시작합니다.");
        }
        int x = 10;
        boolean reslt1 = (x == 20); //변수값이 20이냐
        boolean reslt2 = (x != 20); //변수값이 20이 아니냐
        System.out.println("result1:" + reslt1);
        System.out.println("result2:" + reslt2);
    }
}
