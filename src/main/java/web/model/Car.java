package web.model;

public class Car {
    private String color;
    private String model;
    private int yearRelease;

    public Car(String color, String model, int yearRelease) {
        this.color = color;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
