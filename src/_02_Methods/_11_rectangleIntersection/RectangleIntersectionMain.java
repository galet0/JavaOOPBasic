package _02_Methods._11_rectangleIntersection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;


public class RectangleIntersectionMain {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            String[] firstLine = reader.readLine().trim().split("\\s+");
            int numberOfRectangles = Integer.parseInt(firstLine[0]);
            int intersectionsCheck = Integer.parseInt(firstLine[1]);
            LinkedHashMap<String, Rectangle> listOfRectangles = new LinkedHashMap<>();

            for (int i = 0; i < numberOfRectangles; i++) {
                firstLine = reader.readLine().split("\\s+");

                String id = firstLine[0];
                double width = Double.parseDouble(firstLine[1]);
                double height = Double.parseDouble(firstLine[2]);
                double x = Double.parseDouble(firstLine[3]);
                double y = Double.parseDouble(firstLine[4]);
                Rectangle rectangle = new Rectangle(id, width, height, x, y);
                listOfRectangles.put(id, rectangle);
            }
            for (int i = 0; i < intersectionsCheck; i++) {
                String[] line = reader.readLine().trim().split("\\s+");
                String firstRectangle = line[0];
                String secondRectangle = line[1];
                System.out.println(listOfRectangles.get(firstRectangle)
                        .doesIntersect(listOfRectangles.get(secondRectangle)));
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
