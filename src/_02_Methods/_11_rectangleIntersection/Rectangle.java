package _02_Methods._11_rectangleIntersection;


public class Rectangle {
    private String id;
    private double minX;
    private double minY;
    private double maxX;
    private double maxY;
//    private double width;
//    private double height;
//    private double horizontal;
//    private double vertical;

    public Rectangle(String id, double width, double height, double horizontal, double vertical) {
        this.id = id;
        this.minX = horizontal;
        this.minY = vertical;
        this.maxX = horizontal + width;
        this.maxY = vertical + height;
    }

    public boolean doesIntersect (Rectangle otherRect){
        return this.maxX >= otherRect.minX &&
                this.minX <= otherRect.maxX &&
                this.maxY >= otherRect.minY &&
                this.minY <= otherRect.maxY;
    }
    
}
