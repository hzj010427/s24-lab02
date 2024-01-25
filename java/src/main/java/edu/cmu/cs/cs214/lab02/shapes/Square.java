package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    /**
     * The length of the side of the square
     */
    private double sideLen;

    /**
     * Constructor with the length of the side of the square
     * @param sideLen the length of the side of the square
     */
    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
