public class ShapeFactory {
    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";

    public Shape getShape(String typeShape) {
        switch (typeShape) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }

}
