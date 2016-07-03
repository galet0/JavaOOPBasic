package _02_Methods._13_DrawingTool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 26.06.2016.
 */
public class DrawingToolMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Figure figure = null;

        switch (input){
            case "Square":
                int size = Integer.parseInt(reader.readLine());
                figure = new Square(size);
                break;

            case "Rectangle":
                int width = Integer.parseInt(reader.readLine());
                int height = Integer.parseInt(reader.readLine());
                figure = new Rectangle(width,height);
                break;
        }
        figure.draw();
    }
}
