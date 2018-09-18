package polymorphism;

public class Circle  implements IShape{
    @Override
    public double Area() {
        return 10;
    }

    @Override
    public double Perimeter() {
        return 10;
    }
}
