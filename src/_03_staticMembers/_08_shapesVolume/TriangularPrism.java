package _03_staticMembers._08_shapesVolume;

/**
 * Created by User on 28.06.2016.
 */
public class TriangularPrism extends VolumeCalculator{
    private double baseSide;
    private double height;
    private double length;

    public TriangularPrism(String name, double baseSide, double height, double length) {
        super(name);
        this.baseSide = baseSide;
        this.height = height;
        this.length = length;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
