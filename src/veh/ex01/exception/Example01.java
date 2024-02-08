package veh.ex01.exception;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Example01 {
    public static void main(String[] args)throws IOException {
        File file = new File("D://test/src/example01.txt");

        try {
            boolean success = file.createNewFile();
            if (success) {
                System.out.println("파일의 이름 :" + file.getName());
                System.out.println("파일의 경로 :" + file.getAbsolutePath());
                System.out.println("파일 쓰기가 가능한가? :" + file.canWrite());
                System.out.println("파일 읽기가 가능한가? :" + file.canRead());
                System.out.println("파일의 크기 : "+ file.length());
            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
