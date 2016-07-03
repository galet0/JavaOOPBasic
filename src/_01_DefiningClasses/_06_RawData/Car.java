package _01_DefiningClasses._06_RawData;


import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;
    List<Tires> tire = new ArrayList<>();


    public Car(String model) {
        this.model = model;
    }
}
