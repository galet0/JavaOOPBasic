package _02_Methods._08_Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 26.06.2016.
 */
public class CarMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        double speed = Double.parseDouble(input[0]);
        double fuel = Double.parseDouble(input[1]);
        double fuelEconomy = Double.parseDouble(input[2]);
        Car car = new Car(speed, fuel, fuelEconomy);

        while (true){
            String[] command = reader.readLine().split("\\s+");
            if(command[0].equals("END")){
                break;
            }

            switch (command[0]){
                case "Travel":
                    double distance = Double.parseDouble(command[1]);
                    car.travel(distance);
                    break;
                case "Refuel":
                    double litters = Double.parseDouble(command[1]);
                    car.refuel(litters);
                    break;
                case "Distance":
                    System.out.printf("Total distance: %s kilometers\n", car.getDistance());
                    break;
                case "Time":
                    double totalTime = car.getTime();
                    int hours = (int)totalTime / 60;
                    int minutes = (int) totalTime % 60;
                    System.out.printf("Total time: %d hours and %d minutes\n", hours, minutes);
                    break;
                case "Fuel":
                    System.out.printf("Fuel left: %s liters\n", car.getFuelAmount());
                    break;
            }
        }
    }
}
