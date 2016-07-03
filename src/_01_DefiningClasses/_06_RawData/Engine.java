package _01_DefiningClasses._06_RawData;

/**
 * Created by User on 24.06.2016.
 */
public class Engine extends Car {
    int engineSpeed;
    int enginePower;

    public Engine(String model, int engineSpeed, int enginePower) {
        super(model);
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }
}
