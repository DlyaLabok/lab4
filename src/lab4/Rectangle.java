package lab4;

/**
 * Class representing a rectangle as a graphical object.
 * Supports drawing using multiple APIs.
 *
 * @author Teteruk Ivanna
 */
public class Rectangle extends GraphicObject {
    private double x, y, width, height;

    /**
     * Constructor to initialize the rectangle.
     *
     * @param x the x-coordinate of the rectangle
     * @param y the y-coordinate of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param drawingAPI1 the first drawing API
     * @param drawingAPI2 the second drawing API
     */
    public Rectangle(double x, double y, double width, double height, DrawingAPI1 drawingAPI1, DrawingAPI2 drawingAPI2) {
        super(drawingAPI1, drawingAPI2);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawWithAPI1() {
        drawingAPI1.drawRectangle(x, y, width, height);
    }

    @Override
    public void drawWithAPI2() {
        drawingAPI2.renderRectangle(x, y, width, height);
    }
}
