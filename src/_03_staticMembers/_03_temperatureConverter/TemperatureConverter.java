package _03_staticMembers._03_temperatureConverter;

public class TemperatureConverter {
    private static Double temperature;

    static {
        temperature = 0.0;
    }
    public static double temperatureInCelsius(double grads){
        //°C  x  9/5 + 32 = °F
        return temperature = (grads * 9.0) / 5 + 32;
    }

    public static double temperatureInFahrenheit(double grads){
        //(50°F - 32) x .5556 = 10°C
        return temperature = (grads - 32) * 0.5556;
    }

}
