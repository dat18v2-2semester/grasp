package polymorphism;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Creature creature = new Creature();
        creature.respondToAttack();


       Creature cat = new Cat();
       cat.respondToAttack();

       Creature dog = new Dog();
       dog.respondToAttack();


        ArrayList<Creature> creatures = new ArrayList<Creature>();
        creatures.add(new Dog());
        creatures.add(new Cat());
        creatures.add(new Dog());
        creatures.add(new Dog());
        creatures.add(new Creature());
        creatures.add(new Cat());
        creatures.add(new Cat());


        for (Creature c : creatures) {
            c.respondToAttack();
        }


        ArrayList<IShape> shapes = new ArrayList<IShape>();
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (IShape s : shapes) {
            System.out.println(s.Area());
            System.out.println(s.Perimeter());
        }

    }
}
