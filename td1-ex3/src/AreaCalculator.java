public class AreaCalculator {
    public double calculateArea(Shape shape) {
        switch (shape.getType()) {
            case RECTANGLE:
                return shape.getWidth() * shape.getHeight();
            case CIRCLE:
                return Math.PI * shape.getRadius() * shape.getRadius();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
