package lab4;

/**
 * Main class to demonstrate the vector graphics editor functionality.
 *
 * @author Teteruk Ivanna
 */
public class Main {
    public static void main(String[] args) {
        // Create drawing API implementations
        DrawingAPI1 api1 = new DrawingAPI1Impl();
        DrawingAPI2 api2 = new DrawingAPI2Impl();

        // Create a rectangle graphical object
        GraphicObject rectangle = new Rectangle(10, 20, 30, 40, api1, api2);

        // Draw the rectangle using API1
        System.out.println("Using API1:");
        rectangle.drawWithAPI1();

        // Draw the rectangle using API2
        System.out.println("Using API2:");
        rectangle.drawWithAPI2();
    }
}
