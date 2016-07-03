package _02_Methods._13_DrawingTool;

/**
 * Created by User on 26.06.2016.
 */
public class Square implements Figure{
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.printf("|%s|\n",new String(new char[this.size]).replace("\0","-"));
        for (int i = 0; i < this.size - 2; i++) {
            System.out.printf("|%s|\n",new String(new char[this.size]).replace("\0"," "));
        }
        System.out.printf("|%s|\n",new String(new char[this.size]).replace("\0","-"));
    }
}
