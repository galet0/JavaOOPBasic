package _03_staticMembers._03_temperatureConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TemperatureConverterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            double grads = Double.parseDouble(input[0]);
            String units = input[1];

            if(units.equals("Celsius")){
                System.out.printf("%.2f Fahrenheit\n",TemperatureConverter.temperatureInCelsius(grads));
            } else if(units.equals("Fahrenheit")){
                System.out.printf("%.2f Celsius\n",TemperatureConverter.temperatureInFahrenheit(grads));
            }
        }

    }
}
