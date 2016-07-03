package _04_encapsulation._01_classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class BoxMain {
    public static void main(String[] args) throws IOException {
        Class boxClass = Box.class;
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields)
                .stream()
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            double length = Double.parseDouble(reader.readLine());
            double width = Double.parseDouble(reader.readLine());
            double height = Double.parseDouble(reader.readLine());

            Box box = new Box(length, width, height);

            System.out.printf("Surface Area - %.2f\n", box.getSurfaceArea(length, width, height));
            System.out.printf("Lateral Surface Area - %.2f\n", box.getLateralSurfaceArea(length, width, height));
            System.out.printf("Volume - %.2f\n", box.getVolume(length, width, height));

        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
