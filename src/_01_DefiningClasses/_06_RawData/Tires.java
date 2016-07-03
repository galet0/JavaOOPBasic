package _01_DefiningClasses._06_RawData;


public class Tires extends Car{
    double tire1Pressure;
    int tire1Age;
    double tire2Pressure;
    int tire2Age;
    double tire3Pressure;
    int tire3Age;
    double tire4Pressure;
    int tire4Age;


    public Tires(String model,double tire1Pressure, int tire1Age,
            double tire2Pressure, int tire2Age,
            double tire3Pressure, int tire3Age,
            double tire4Pressure, int tire4Age) {
        super(model);
        this.tire1Pressure = tire1Pressure;
        this.tire1Age = tire1Age;
        this.tire2Pressure = tire2Pressure;
        this.tire2Age = tire2Age;
        this.tire3Pressure = tire3Pressure;
        this.tire3Age = tire3Age;
        this.tire4Pressure = tire4Pressure;
        this.tire4Age = tire4Age;
    }

}
