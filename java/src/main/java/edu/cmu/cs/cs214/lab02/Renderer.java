package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    /**
     * The shape to be rendered
     */
    private Shape shape;

    /**
     * Constructor with a shape to be rendered
     * @param shape the shape to be rendered
     */
    public Renderer(Shape shape) {
        this.shape = shape;
    }

    /**
     * Prints the shape and its area to the console
     */
    public void draw() {
        System.out.println("Shape printed\n" + "Its area is " + shape.getArea());
    }
}
