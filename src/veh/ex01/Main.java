package veh.ex01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("���ڸ� �Է��ϼ���: ");

        boolean val = false;
        // ���Խ��� ����Ͽ� ���ڸ��� �����ϴ��� Ȯ��
        while (!val) {
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                System.out.println("�Է��� ���� �����Դϴ�: " + input);
                val = true;
            } else {
                System.out.println("���ڰ� �ƴ� ���� ���ԵǾ� �ֽ��ϴ�.");
                System.out.println("���ڸ� �Է����ּ���.");
            }
        }
        scanner.close();
    }
}
