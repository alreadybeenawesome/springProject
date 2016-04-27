package spring_factorybean_demo1;

/**
 * Created by louis.yu on 2016/4/27.
 */
public class Car {
    private String brand;
    private String color;
    private int speed;
    private double price;
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }


    public Car() {
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
