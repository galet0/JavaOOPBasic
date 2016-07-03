package _01_DefiningClasses._05_SpeedRacing;


public class Car {
    String model;
    double fuelAmount;
    double fuelCost;
    int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }

    public void drive(int distance){
        if(distance * fuelCost <= fuelAmount){
            distanceTraveled += distance;
            fuelAmount -= distance * fuelCost;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount, this.distanceTraveled);
    }
}
