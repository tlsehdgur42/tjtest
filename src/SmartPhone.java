//public class SmartPhone {
//    //    폰 이름
//    private String phoneName;
//    //    폰 번호
//    private String phoneNumber;
//    //    폰 용량
//    private String phoneCapacity;
//    //    폰 사이즈
//    private int phoneSize;
//    //    폰 가격
//    private int phonePrice;
//
//    public SmartPhone() {
//    }
//
//    public SmartPhone(String _phoneName, String _phoneNumber, String _phoneCapacity, int _phoneSize, int _phonePrice) {
//        phoneName = _phoneName;
//        phoneNumber = _phoneNumber;
//        phoneCapacity = _phoneCapacity;
//        phoneSize = _phoneSize;
//        phonePrice = _phonePrice;
//    }
//
//
//
//}
//
//
//public class Smartphone {
//    // 속성 5가지
//    private String brand;
//    private String model;
//    private int memory;
//    private String color;
//    private double price;
//
//    // 생성자
//    public Smartphone(String brand, String model, int memory, String color, double price) {
//        this.brand = brand;
//        this.model = model;
//        this.memory = memory;
//        this.color = color;
//        this.price = price;
//    }
//
//    // 기능 5가지
//    public void call(String number) {
//        System.out.println(number + "번에 전화를 걸고 있습니다.");
//    }
//
//    public void sendMessage(String number, String message) {
//        System.out.println(number + "번에 '" + message + "'라는 메시지를 보냅니다.");
//    }
//
//    public void takePhoto()  {      System.out.println("사진을 찍습니다.");
//    }
//
//    public void playMusic(String songName) {
//        System.out.println(songName + " 노래를 재생합니다.");
//    }
//
//    public void installApp(String appName) {
//        System.out.println(appName + " 앱을 설치합니다.");
//    }
//    // toString 오버라이딩
//    @Override
//    public String toString() {
//        return "Smartphone {" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", memory=" + memory +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}