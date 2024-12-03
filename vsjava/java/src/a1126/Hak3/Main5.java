package a1126.Hak3;

public class Main5 {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 29);
        System.out.println(person.toString());
        //객체 person -> person.toString() 생략 된 형태
        //toString()은 Object에서 상속 받은 메서드, 객체의 문자열 표현을 정의하는 메서드

        //getter setter가 없어 출력할 방법이 없다.
        // System.out.println(person.toStr());

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toStr(){
        return String.format("이름 : %s , 나이 : %d", name , age);
    }
}
