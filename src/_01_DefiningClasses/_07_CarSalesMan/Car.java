package _01_DefiningClasses._07_CarSalesMan;

/**
 * Created by User on 25.06.2016.
 */
public class Car {
    String model;
    String engine;
    int weight;
    String color;

    public Car(String model, String engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, String engine, String color) {
        this(model, engine, 0, color);
    }
}
