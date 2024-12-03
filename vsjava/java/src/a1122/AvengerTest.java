package a1122;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);

    }
}

class Avenger{
    String name;
    int hp;
    public Avenger(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
}
