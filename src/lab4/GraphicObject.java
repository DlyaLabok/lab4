package lab4;

/**
 * Abstract class representing a graphical object.
 * Supports multiple drawing APIs for rendering.
 *
 * @author Teteruk Ivanna
 */
public abstract class GraphicObject {
    protected DrawingAPI1 drawingAPI1;
    protected DrawingAPI2 drawingAPI2;

    /**
     * Constructor to initialize the graphical object with drawing APIs.
     *
     * @param drawingAPI1 the first drawing API
     * @param drawingAPI2 the second drawing API
     */
    public GraphicObject(DrawingAPI1 drawingAPI1, DrawingAPI2 drawingAPI2) {
        this.drawingAPI1 = drawingAPI1;
        this.drawingAPI2 = drawingAPI2;
    }

    /**
     * Draws the object using API1.
     */
    public abstract void drawWithAPI1();

    /**
     * Draws the object using API2.
     */
    public abstract void drawWithAPI2();
}
