//package com.welcome;
//
//import com.animal.ex02.ex05.ex03.B;
//
//import java.util.Scanner;
//
//public class Welcome {
//    static final int NUM_BOOK = 3;
//    static final int NUM_ITEM = 7;
//    //    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
//    //    static int mCartCount = 0;
//    static Cart mCart = new Cart();
//    static User mUser;
//
//    public static void main(String[] args) {
//
//        // String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
//        Book[] mBookList = new Book[NUM_BOOK];
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("당신의 이름을 입력하세요 : ");
//        String userName = input.next();
//        System.out.print("연락처를 입력하세요 : ");
//        int userMobile = input.nextInt();
//
//        mUser = new User(userName, userMobile);
//
//        String greeting = "Welcome to Shopping Mall";
//        String tagline = "Welcome to Book Market";
//        boolean quit = false;
//        while (!quit) {
//            System.out.println("******************************");
//            System.out.println("\t" + greeting);
//            System.out.println("\t" + tagline);
////            System.out.println("******************************");
////            System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
////            System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
////            System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
////            System.out.println(" 7. 영수증 표시하기 \t8. 종료");
////            System.out.println("******************************");
//
//            menuIntroduction();
//            System.out.println("메뉴 번호를 선택해주세요");
//            int n = input.nextInt();
//            System.out.println(n + "번을 선택했습니다");
//            if (n < 1 || n > 9) {
//                System.out.println("1부터 9까지의 숫자를 입력하세요.");
//            } else {
//                switch (n) {
//                    case 1:
//                        System.out.println("현재 고객 정보 : ");
//                        System.out.println("이름 " + userName + "연락처 " + userMobile);
//                        menuGuestInfo(userName, userMobile);
//                        break;
//                    case 2:
//                        System.out.println("장바구니 상품 목록 보기 : ");
//                        menuCartItemList();
//                        break;
//                    case 3:
//                        System.out.println("장바구니 비우기");
//                        menuCartClear();
//                        break;
//                    case 4:
//                        System.out.println("장바구니에 항목 추가하기 : ");
////                        menuCartAddItem(mBook);
//                        menuCartAddItem(mBookList);
//                        break;
//                    case 5:
//                        System.out.println("5. 장바구니의 항목 수량 줄이기");
//                        menuCartRemoveItemCount();
//                        break;
//                    case 6:
//                        System.out.println("6. 장바구니의 항목 삭제하기");
//                        menuCartRemoveItem();
//                        break;
//                    case 7:
//                        System.out.println("7. 영수증 표시하기");
//                        menuCartBill();
//                        break;
//                    case 8:
//                        System.out.println("8. 종료");
//                        menuExit();
//                        quit = true;
//                        break;
//                    case 9:
//                        System.out.println("관리자 로그인");
//                        munuAdminLogin();
//                        break;
//                }
//            }
//
//        }
//
//    }
//
//    public static void munuAdminLogin() {
//        System.out.println("관리자 정보를 입력하세요");
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("아이디 : ");
//        String adminId = input.next();
//        System.out.print("비밀번호 : ");
//        String adminPW = input.next();
//
//        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
//        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
//            System.out.println("이름 " + admin.getName() + " 연락처 " + admin.getPhone());
//            System.out.println("아이디 " + admin.getId() + "비밀번호 " + admin.getPassword());
//        } else {
//            System.out.println("관리자 정보가 일치하지 않습니다.");
//        }
//    }
//
//    public static void menuIntroduction() {
//        System.out.println("******************************");
//        System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
//        System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
//        System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
//        System.out.println(" 7. 영수증 표시하기 \t8. 종료");
//        System.out.println(" 9. 관리자 로그인");
//        System.out.println("******************************");
//    }
//    public static void menuGuestInfo(String name ,int mobile) {
////        System.out.println("현재 고객 정보 : ");
////        System.out.println("이름 " + name + "연락처 " + mobile);
////        Person person = new Person(name,mobile);
//        System.out.println("이름 " + mUser.getName() + " 연락처 " + mUser.getPhone());
//    }
//    public static void menuCartItemList() {
//        System.out.println("장바구니 상품 목록 :");
//        System.out.println("-----------------------------------------------");
//        System.out.println("    도서ID \t|     수량\t|         합계");
//        for (int i = 0; i < mCartCount; i++) {
//            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");
//            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
//            System.out.print("    " + mCartItem[i].getTotalPrice());
//            System.out.println("   ");
//        }
//        System.out.println("-----------------------------------------------");
//    }
//    public static void menuCartClear() {
//        System.out.println("장바구니 비우기");
//    }
//    public static void menuCartAddItem(String[][] book) {
//        System.out.println("장바구니에 항목 추가하기 : ");
//        BookList(book);
//        for (int i = 0; i < NUM_BOOK; i++) {
//            for (int j = 0; j < NUM_ITEM; j++)
//                System.out.print(book[i][j] + " | ");
//            System.out.println("");
//        }
//        boolean quit = false;
//        while(!quit) {
//            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
//            Scanner input = new Scanner(System.in);
//            String str = input.nextLine();
//            boolean flag = false;
//            int numId = -1;
//            for (int i = 0; i < NUM_BOOK; i++) {
//                if(str.equals(book[i][0])){
//                    numId = i;
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag) {
//                System.out.println("장바구니에 추가하겠습니까? Y | N ");
//                str = input.nextLine();
//                if(str.toUpperCase().equals("Y")) {
//                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
//                    if(!isCartInBook(book[numId][0]))
//                        mCartItem[mCartCount++] = new CartItem(book[numId]);
//                }
//                quit = true;
//            } else System.out.println("다시 입력해 주세요.");
//        }
//    }
//    public static void menuCartRemoveItemCount() {
//        System.out.println("5. 장바구니의 항목 수량 줄이기");
//    }
//    public static void menuCartRemoveItem() {
////        System.out.println("6. 장바구니의 항목 삭제하기");
//        if (mCart.mCartCount == 0) {
//            System.out.println("장바구니에 항목이 없습니다.");
//        } else {
//            menuCartItemList();
//            boolean quit = false;
//            while (!quit) {
//                System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요.");
//                Scanner input = new Scanner(System.in);
//                String str = input.nextLine();
//                boolean flag = false;
//                int numId = -1;
//
//                for (int i = 0; i < mCart.mCartCount; i++) {
//                    if (str.equals(mCart.mCartItem[i].getBookID())) {
//                        numId = i;
//                        flag = true;
//                        break;
//                    }
//                }
//                if (flag) {
//                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N");
//                    str = input.nextLine();
//                    if (str.toUpperCase().equals("Y")) {
//                        System.out.println(mCart.mCartItem[numId].getBookID() + "장바구니에서 도서가 삭제되었습니다.");
//                        mCart.removeCart(numId);
//                    }
//                    quit = true;
//                } else {
//                    System.out.println();
//                }
//            }
//        }
//    }
//    public static void menuCartBill() {
//        System.out.println("7. 영수증 표시하기");
//    }
//    public static void menuExit() {
//        System.out.println("8. 종료");
//    }
//
//    public static void BookList(Book[] booklist) {
//        booklist[0] = new Book("ISBN2222", "쉽게 배우는 JSP", 27000);
//        booklist[0].setAuthor("송미영");
//        booklist[0].setDescription("단계별로 쇼핑몰을 구현하면 배우는 JSP 웹 프로그래밍");
//        booklist[0].setCategory("IT전문서");
//        booklist[0].setReleaseDate("2018/10/08");
//
//        booklist[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000);
//        booklist[1].setAuthor("우재남");
//        booklist[1].setDescription("실습 단계별 명쾌한 멘토링!");
//        booklist[1].setCategory("IT전문서");
//        booklist[1].setReleaseDate("2022/01/28");
//
//        booklist[2] = new Book("ISBN1516", "스크래칭", 22000);
//        booklist[1].setAuthor("고광일");
//        booklist[1].setDescription("컴퓨팅 사고력을 키우는 블록 코딩");
//        booklist[1].setCategory("컴퓨터 입문");
//        booklist[1].setReleaseDate("2019/06/10");
//
//    }
//    public static boolean isCartInBook(String bookId) {
//        boolean flag = false;
//        for (int i = 0; i < mCartCount; i++) {
//            if(bookId == mCartItem[i].getBookID()) {
//                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
//                flag = true;
//            }
//        }
//        return flag;
//    }
//}
//
//
