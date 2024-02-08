package veh.ex01.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        File file = new File("member.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();

                FileWriter fw = new FileWriter(file, true);
                Scanner input = new Scanner(System.in);

                // quit의 원래 뜻이 종료라는 뜻이다.
                boolean quit = false;
                while (!quit) {
                    System.out.print("아이디 :");
                    String userID = input.next();
                    fw.write("아이디 :" + userID + " ");

                    System.out.println("이름 :");
                    String userName = input.next();
                    fw.write("이름 : " + userName + " ");

                    System.out.println("계속 진행 : Y | N");
                    input = new Scanner(System.in);
                    String str = input.nextLine();

                    if (str.toUpperCase().equals("N")) {
                        quit = true;
                    }

                }
                fw.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
