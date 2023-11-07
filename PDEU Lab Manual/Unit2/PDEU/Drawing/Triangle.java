package PDEU.Drawing;

public class Triangle extends Shape {
    
    public double base;
    public double height;

    public Triangle(String colour, String pattern, double base, double height) {
        this.color = colour;
        this.pattern = pattern;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }

    public String toString() {
        return "Triangle:\nColor: " + this.color + " Pattern: " + this.pattern + " Base: " + this.base + " Height: " + this.height;
    }
}
