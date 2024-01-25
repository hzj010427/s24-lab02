package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    /**
     * The height of the rectangle
     */
    private double height;

    /**
     * The width of the rectangle
     */
    private double width;
    
    /**
     * Constructor with the height and width of the rectangle
     * @param height the height of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
