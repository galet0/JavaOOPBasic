package _03_staticMembers._08_shapesVolume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 28.06.2016.
 */
public class ShapesVolumeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }

            String shape = input[0];
            switch (shape){
                case "Cube":
                    double side = Double.parseDouble(input[1]);
                    Cube cube = new Cube("cube", side);
                    System.out.printf("%.3f\n",VolumeCalculator.volumeCube(cube.getLength()));
                    break;
                case "Cylinder":
                    double radius = Double.parseDouble(input[1]);
                    double height = Double.parseDouble(input[2]);
                    Cylinder cylinder = new Cylinder("Cylinder", radius, height);
                    System.out.printf("%.3f\n", VolumeCalculator
                            .volumeCylinder(cylinder.getRadius(), cylinder.getHeight()));
                    break;
                case "TrianglePrism":
                    double baseSide = Double.parseDouble(input[1]);
                    double heightPrism = Double.parseDouble(input[2]);
                    double length = Double.parseDouble(input[3]);
                    TriangularPrism prism = new TriangularPrism("TrianglePrism", baseSide, heightPrism, length);
                    System.out.printf("%.3f\n", VolumeCalculator
                            .volumeTriangularPrism(prism.getBaseSide(),
                                    prism.getHeight(),
                                    prism.getLength()));
                    break;
            }
        }

    }
}
