package lesson48.designpattern;

public class Main2 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }
}
