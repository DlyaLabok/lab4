package lab4;
/**
 * Implementation of DrawingAPI2 for rendering rectangles.
 *
 * @author Teteruk Ivanna
 */
public class DrawingAPI2Impl implements DrawingAPI2 {
    @Override
    public void renderRectangle(double x, double y, double width, double height) {
        System.out.println("API2: Rendering rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}