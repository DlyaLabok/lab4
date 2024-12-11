package lab4;
/**
 * Implementation of DrawingAPI1 for drawing rectangles.
 *
 * @author Teteruk Ivanna
 */
public class DrawingAPI1Impl implements DrawingAPI1 {
    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("API1: Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}