# Polymorphsm

## Enheritance


````     
public class Creature {
    public void respondToAttack(){
        System.out.println("Im the Creature, im being attacked");
    }
}
````  

````     
public class Dog extends Creature {
    @Override
    public void respondToAttack(){ 
        System.out.println("Im the Dog, im being attacked");
    }
}

````     

````     
public class Cat extends Creature{
    @Override
    public void respondToAttack(){
        System.out.println("Im the Cat, im being attacked");
    }
}

````     

## Interfaces

````     
public interface Shape {
    public double area();
    public double perimeter();
}
````  

````     
import static java.lang.Math.PI;
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return PI * 2 * radius;
    }
}
````     

````     
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
````     

````     
import static java.lang.Math.sqrt;
public class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return sqrt((a + b - c) * (a - b + c) * (-a + b + c) * (a + b + c)) / 4.0;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
```` 
