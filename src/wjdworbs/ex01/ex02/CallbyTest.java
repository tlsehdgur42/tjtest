package wjdworbs.ex01.ex02;

public class CallbyTest {
    public static void main(String[] args) {

        // 콜 바이 밸류
        int a = 10;
        System.out.println(a);
        aaaaa(10);
        System.out.println(a);

        // 콜 바이 레퍼런스 = 주소값
        Car car = new Car();
        car.setSpeed(100);
        System.out.println(car.getSpeed());
        bbb(car);
        System.out.println(car.getSpeed()); //22

        double speed = car.getSpeed();
        System.out.println(speed); //22
        cccc(speed);
        System.out.println(speed);

    }

    private static void cccc(double speed) {
        speed = 33;
    }

    public static void aaaaa(int a){
        a = 8;
    }

    public static void bbb(Car car){
        car.setSpeed(22);
    }
}
