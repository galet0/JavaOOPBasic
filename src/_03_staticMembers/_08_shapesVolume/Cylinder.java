package _03_staticMembers._08_shapesVolume;

/**
 * Created by User on 28.06.2016.
 */
public class Cylinder extends VolumeCalculator{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
