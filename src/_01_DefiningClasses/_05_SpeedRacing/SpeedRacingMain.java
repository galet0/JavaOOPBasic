package _01_DefiningClasses._05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by User on 24.06.2016.
 */
public class SpeedRacingMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] input = null;
        TreeMap<String, Car> carList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            input = reader.readLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelcostPerKm = Double.parseDouble(input[2]);
            Car car = new Car(model, fuelAmount,fuelcostPerKm);
            carList.put(model,car);
        }
        input = reader.readLine().split("\\s+");
        while (!input[0].equals("End")){
            if(input[0].equals("End")){
                break;
            }
            String currCar = input[1];
            int distanceToTravel = Integer.parseInt(input[2]);
            for (Car car : carList.values()) {
                if(car.model.equals(currCar)){
                    car.drive(distanceToTravel);
                }
            }

//            double currCarFuelPerKm = carList.get(currCar).fuelCost;
//            double currCarFuelAmount = carList.get(currCar).fuelAmount;
//            double fuelNeed = distanceToTravel * currCarFuelPerKm;
//            if(fuelNeed <= currCarFuelAmount){
//                carList.get(currCar).distanceTraveled += distanceToTravel;
//                carList.get(currCar).fuelAmount -= fuelNeed;
//            } else {
//                System.out.println("Insufficient fuel for the drive");
//            }
            input = reader.readLine().split("\\s+");

        }
        for (Car car : carList.values()) {
            System.out.println(car);
        }

    }
}
