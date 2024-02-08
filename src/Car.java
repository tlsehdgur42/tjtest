public class Car {
    private String model;
    private int cost;

    private String color;

    public Car(String model, int cost) {
        this.model = model;
        this.cost = cost;
        this.color = "Black";
    }

    public Car(String model, int cost, String color) {
        this.model = model;
        this.cost = cost;
        this.color = color;
    }

    public void getModel() {
        System.out.println(model);
    }

    public void getCost() {
        System.out.println(cost);
    }

    public void getColor() {
        System.out.println(color);
    }

}
