package veh.ex01.exception;

import java.io.File;
import java.io.FileOutputStream;

public class Example02 {
    public static void main(String[] args) {
//        String str = "Hello Java Programming";
        try {
            File file = new File("gugudan.txt");
            if (!file.exists()) {
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                for (int i = 2; i <= 9; i++) {
                    for (int j = 1; j < 9; j++) {
                        String str = i + "x" + j + "=" + i * j + "\n";
                        byte[] b = str.getBytes();
                        fos.write(b);
                    }
                }
                fos.close();
                System.out.println("파일 쓰기 성공");
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
