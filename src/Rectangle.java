public class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getDescribable() {
        return "length : " + this.length
                + " ; width : " + this.width
                + " ; color : " + this.color;
    }
}
