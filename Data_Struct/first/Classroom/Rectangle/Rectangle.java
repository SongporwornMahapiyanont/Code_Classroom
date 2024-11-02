package Rectangle;
// Define the Rectangle class
public class Rectangle {
    // Declare a private variable to store the width of the rectangle
    private double width;
    // Declare a private variable to store the height of the rectangle
    private double height;

    // Constructor for the Rectangle class that initializes the width and height variables
    public Rectangle(double width, double height) {
        // Set the width variable to the provided width parameter
        this.width = width;
        // Set the height variable to the provided height parameter
        this.height = height;
    }
    public Rectangle() {
        
    }

    // Method to retrieve the width of the rectangle
    public double getWidth() {
        // Return the value of the width variable
        return width;
    }

    // Method to set the width of the rectangle
    public void setWidth(double width) {
        // Set the width variable to the provided width parameter
        this.width = width;
    }

    // Method to retrieve the height of the rectangle
    public double getHeight() {
        // Return the value of the height variable
        return height;
    }

    // Method to set the height of the rectangle
    public void setHeight(double height) {
        // Set the height variable to the provided height parameter
        this.height = height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        // Calculate the area by multiplying width and height, and return the result
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        // Calculate the perimeter by adding width and height, multiplying by 2, and return the result
        return 2 * (width + height);
    }
    public String toString() {
        return "["+String.format("%.2f",this.width)+":"+String.format("%.2f",this.height)
                +"]"+"=>"+String.format("%.2f",this.getArea());
    }
}

