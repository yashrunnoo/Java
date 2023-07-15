import java.util.ArrayList;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing Circleee");
    }
}

public class GenericTest {

    public static void drawShapes(ArrayList<? extends Shape> myList) {
        for (Shape s : myList) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        ArrayList<Rectangle> myRectangles = new ArrayList<>();
        ArrayList<Circle> myCircles = new ArrayList<>();

        myCircles.add(new Circle());
        myCircles.add(new Circle());

        myRectangles.add(new Rectangle());
        myRectangles.add(new Rectangle());

        drawShapes(myCircles);
        drawShapes(myRectangles);
    }
}
