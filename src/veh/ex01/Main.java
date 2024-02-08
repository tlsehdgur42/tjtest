package veh.ex01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");

        boolean val = false;
        // 정규식을 사용하여 숫자만을 포함하는지 확인
        while (!val) {
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                System.out.println("입력한 값은 숫자입니다: " + input);
                val = true;
            } else {
                System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
                System.out.println("숫자를 입력해주세요.");
            }
        }
        scanner.close();
    }
}
