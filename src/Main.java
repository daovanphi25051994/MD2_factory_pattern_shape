public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Circle newCircle = (Circle) circle;
        newCircle.setRadius(5.5);
        newCircle.setColor("red");
        System.out.println(newCircle.getDescribable());

    }
}
