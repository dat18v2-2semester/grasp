package polymorphism;

public class Square implements IShape {
    @Override
    public double Area() {
        return 2;
    }

    @Override
    public double Perimeter() {
        return 2;
    }
}
