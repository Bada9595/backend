package a1127.number.upcasting;

public class UpcastingEX {
    public static void main(String[] args) {
        Child childObj = new Child();
        Parent parentObj = new Parent();
        childObj.show();
        parentObj.show();
        Parent parentRef = (Parent) childObj; //업캐스팅 (묵시적 형변환)

    }
}
class Parent {
    void show(){
        System.out.println("부모클래스 메서드");
    }   
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("자식클래스 메서드");
    }
    void childspecial(){
        System.out.println("자식특별한 메서드"); 
    }

}
