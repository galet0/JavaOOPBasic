package _01_DefiningClasses._06_RawData;

/**
 * Created by User on 24.06.2016.
 */
public class Cargo extends Car {
    int cargoWeight;
    int cargoType;

    public Cargo(String model,int cargoWeight, int cargoType) {
        super(model);
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
}
