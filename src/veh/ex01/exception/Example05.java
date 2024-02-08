package veh.ex01.exception;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        File file = new File("member.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();

                FileWriter fw = new FileWriter(file);
                Scanner input = new Scanner(System.in);

                boolean quit = false;
                while (!quit) {
                    System.out.println("아이디 :");
                    String userID = input.next();
                    fw.write("아이디 :" + userID + "");
                    System.out.println("이름 :");
                    String userName = input.next();
                    fw.write("이름 :");
                }
            }
        } catch (Exception e) {

        }
    }
}
