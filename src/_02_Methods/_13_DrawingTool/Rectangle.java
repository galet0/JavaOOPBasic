package _02_Methods._13_DrawingTool;

/**
 * Created by User on 26.06.2016.
 */
public class Rectangle implements Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("|%s|\n",new String(new char[this.width]).replace("\0","-"));
        for (int i = 0; i < this.height - 2; i++) {
            System.out.printf("|%s|\n",new String(new char[this.width]).replace("\0"," "));
        }
        System.out.printf("|%s|\n",new String(new char[this.width]).replace("\0","-"));
    }
}
