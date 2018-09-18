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
public class Cat extends Creature{
    @Override
    public void respondToAttack(){
        System.out.println("Im the Cat, im being attacked");
    }
}

```` 
