//import java.util.Scanner;
//
//public class Exception1 {
//    static void check(){
//        System.out.println("���� �޼���");
//        int div = 5 / 0;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("���ڸ� �Է��ϼ���");
//        int num1 = scanner.nextInt();
//
//        try {
//            int num2 = 10 / num1;
//            System.out.println(num2);
//        } catch (Exception e) {
//            System.out.println("�ùٸ� ������ �Է��ϼ���.");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("try~catch ����� �ܺ� �����Դϴ�.");
//
//        try {
//            check();
//        }
//
//        catch (IndexOutOfBoundsException e) {
//            System.out.println("���� �߻�"+ e);
//        }
//    }
//}
