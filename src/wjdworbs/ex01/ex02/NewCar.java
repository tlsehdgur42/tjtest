package wjdworbs.ex01.ex02;

public class NewCar {
    double speed;
    String color;
    static final double MAX_SPEED = 200.0;

    public NewCar() {
    }

    public NewCar(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    static double getMaxSpeed() {
        return MAX_SPEED;
    }

    public boolean speedUp(double speed) {
        // 현재 속도에서 변경할 스피드를 계산 해서 s라는 변수에 담앗다
        double s = this.speed + speed;

        if (s < 0 || s > MAX_SPEED) {
            return false;
        } else {
            this.speed = s;
            return true;
        }
    }

    public double kiloToMile(double distance) {
        // distance 10km
        return distance / 1.6;
    }
    public double mileToKillo(double distance) {
        return distance * 1.6;
    }
}
