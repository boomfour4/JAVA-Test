package edu.pnu.shape;
public class Circle extends edu.pnu.shape.Shape {
    private edu.pnu.shape.Point center;
    private int radius;
    public Circle( edu.pnu.shape.Point p, int radius ) {
        this.center = p;
        this.radius = radius;
    }
    @Override
    public float getArea() {
        return (float)( radius * radius * 3.1416);
    }
    @Override
    public String toString() {
        return "[Circle [" + center.getX() + ", " + center.getY() + "], radius: " + radius + " area: " + String.format("%.2f",getArea()) + "]";
    }
}
