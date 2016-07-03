package _03_staticMembers._08_shapesVolume;


public class VolumeCalculator {
    private static final double DEFAULT_PI = Math.PI;

    private static double pi;
    private String shape;

    static {
        pi = DEFAULT_PI;
    }

    public VolumeCalculator(String shape) {
        this.shape = shape;
    }

    public static double volumeCylinder(double radius, double height){
        double volume = pi * radius * radius * height;
        return volume;
    }

    public static double volumeTriangularPrism(double baseSide, double height, double length){
        double volume = (length / 2) * baseSide * height;
        return volume;
    }

    public static double volumeCube(double length){
        double volume = length * length * length;
        return volume;
    }
}
