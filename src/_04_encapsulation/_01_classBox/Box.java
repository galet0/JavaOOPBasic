package _04_encapsulation._01_classBox;

/**
 * Created by User on 30.06.2016.
 */
public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getSurfaceArea(double length, double width, double height){
        double surfaceArea = 2 * length * width + 2 * length * height + 2 * width * height;
        return surfaceArea;
    }

    public double getLateralSurfaceArea(double length, double width, double height){
        double lateralArea = 2 * length * height + 2 * width * height;
        return lateralArea;
    }

    public double getVolume(double length, double width, double height){
        double volume = this.length * this.width * this.height;
        return volume;
    }

    private void setLength(double length) {
        if(length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
}
