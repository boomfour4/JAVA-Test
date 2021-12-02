package edu.pnu.shape;
public class Rectangle extends edu.pnu.shape.Shape{
    private int width, height;

    public Rectangle( int x1, int y1, int x2, int y2 ) {
        this.width = Math.abs(x2 - x1);
        this.height = Math.abs(y2 - y1);
    }
    @Override
    public float getArea() {
        return (float)(width * height);
    }
    @Override
    public String toString() {
        return "[Rectangle " + width + " " + height + " " + String.format("%.2f",getArea()) + "]";
    }
}
