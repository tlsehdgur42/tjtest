//import java.util.Scanner;
//
//public class Exception1 {
//    static void check(){
//        System.out.println("내부 메서드");
//        int div = 5 / 0;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요");
//        int num1 = scanner.nextInt();
//
//        try {
//            int num2 = 10 / num1;
//            System.out.println(num2);
//        } catch (Exception e) {
//            System.out.println("올바른 문장을 입력하세요.");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("try~catch 블록의 외부 문장입니다.");
//
//        try {
//            check();
//        }
//
//        catch (IndexOutOfBoundsException e) {
//            System.out.println("예외 발생"+ e);
//        }
//    }
//}
