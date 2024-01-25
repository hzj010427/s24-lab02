package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * Constructor with the radius of the circle
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
