package wjdworbs.ex01.ex02;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
    }

    public Time(int _hour, int _minute, int _second) {
        if (_hour >= 0 && _hour < 23) {
            hour = _hour;
        } else {
            hour = 0;
        }
        if (_minute >= 0 && _minute < 59) {
            minute = _minute;
        } else {
            minute = 0;
        }
        if (_second >= 0 && _second < 59) {
            second = _second;
        } else {
            second = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
