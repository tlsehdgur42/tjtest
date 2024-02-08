package wjdworbs.ex01.ex02;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("red");
        System.out.println("myCar의 색 : " + myCar.getColor());
        System.out.println("차의 최대 속력 : " + Car.getMaxSpeed());

        System.out.print("첫 번째 speedUp(100.0km/h): ");
        if (myCar.speedUp(100.0)) {
            System.out.print("속도 변경 가능,");
        } else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println("현재 차의 속력 : " + myCar.getSpeed() + "km/h");
        System.out.print("두 번째 speedUp(90.0km/h) : ");
        if (myCar.speedUp(90.0)) {
            System.out.print("속도 변경 가능,");
        } else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println("현재 차의 속력 : " + myCar.getSpeed() + "km/h");



        Car _myCar = new Car("blue");
        System.out.println("myCar의 색 : " + _myCar.getColor());
        System.out.println("차의 최대 속력 : " + Car.getMaxSpeed());

        System.out.print("첫 번째 speedUp(-100.0km/h): ");
        if (_myCar.speedUp(-100.0)) {
            System.out.print("속도 변경 가능,");
        } else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println("현재 차의 속력 : " + _myCar.getSpeed() + "km/h");
        System.out.print("두 번째 speedUp(210.0km/h) : ");
        if (_myCar.speedUp(210.0)) {
            System.out.print("속도 변경 가능,");
        } else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println("현재 차의 속력 : " + _myCar.getSpeed() + "km/h");

        NewCar newCar = new NewCar();

        double b = newCar.kiloToMile(10.0);
        System.out.println(b);
        double v = newCar.mileToKillo(10.0);
        System.out.println("마일투 킬로" + v);


        System.out.println("*");

        NewCar qwe1 = null;
        qwe1.kiloToMile(123.1);
    }
}
