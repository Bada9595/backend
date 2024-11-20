package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.company = "기아자동차";
        c1.model = "셀토스";
        c1.color = "red";
        c1.maxSpeed = 300;
        c1.speed = 100;

        System.out.println("회사 : " + c1.company);
        System.out.println("모델 : " + c1.model);
        System.out.println("색상 : " + c1.color);
        System.out.println("최고속도 : " + c1.maxSpeed);
        System.out.println("속도 : " + c1.speed);

        c1.speed = 60;
        System.out.println("수정된 속도 : " + c1.speed);

        System.out.println("------------------------");
        Car myCar2 = new Car("기아자동차","투싼","blue",220,60);
        System.out.println("회사 : " + myCar2.company);
        System.out.println("모델 : " + myCar2.model);
        System.out.println("색상 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);
        System.out.println("속도 : " + myCar2.speed);
        
    }
}
