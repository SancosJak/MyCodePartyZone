package l29hw1.l26hw1_2.model;

public class Square extends Shape {
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }
}
