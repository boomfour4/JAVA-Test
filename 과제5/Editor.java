package edu.pnu.edit;
import java.util.ArrayList;
import java.util.List;
public class Editor {
    private List<edu.pnu.shape.Shape> shapes = new ArrayList<>();
    public void add(edu.pnu.shape.Shape newShape) {
        shapes.add(newShape);
    }
    public void clear() {
        shapes.clear();
    }
    public void list() {
        System.out.print("[");
        for (int i = 0; i < shapes.size(); i++) {
            if (i == 0) System.out.print(shapes.get(i).toString());
            else System.out.print(", " + shapes.get(i).toString());
        }
        System.out.println("]");
    }
}
