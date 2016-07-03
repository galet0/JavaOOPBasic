package _03_staticMembers._08_shapesVolume;

public class Cube extends VolumeCalculator{
    private double length;

    public Cube(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
