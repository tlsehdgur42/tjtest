package wjdworbs.ex01.ex02;

public class Plane {
    private String manufacturer;
    private String model;
    private int maxNumberOfPassengers;
    static int numberOfPlanes;

    public Plane() {
        numberOfPlanes++;
    }

    public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        numberOfPlanes++;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public static int getNumberOfPlanes() {
        return numberOfPlanes;
    }
}
