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
