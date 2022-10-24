package prac_3;

class Circle extends Shape{
    double radius;
    @Override
    public double getArea() {
        return 3.14*2*radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14*radius*radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String toString(){return "Circle";}

}