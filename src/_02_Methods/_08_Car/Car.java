package _02_Methods._08_Car;

/**
 * Created by User on 26.06.2016.
 */
public class Car {
    private double speed;
    private double fuelAmount;
    private double fuelEconomy;
    private double distance;
    private double time;

    public Car(double speed, double fuelAmount, double fuelEconomy) {
        this.speed = speed;
        this.fuelAmount = fuelAmount;
        this.fuelEconomy = fuelEconomy;
        this.distance = 0.0;
        this.time = 0.0;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public void refuel(double litters){
        this.fuelAmount += litters;
    }

    public void travel(double distance){
        double distanceCanTravel = (this.fuelAmount * 100) / this.fuelEconomy;
        if(distanceCanTravel < distance){
            distance = distanceCanTravel;
        }

        this.fuelAmount -= distance * (this.fuelEconomy / 100);
        this.distance += distance;
        this.time += (distance / this.speed) * 60;
    }
}
