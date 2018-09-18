package polymorphism;

public class Creature {

    public void respondToAttack(){
        System.out.println("Im the Creature, im being attacked");
    }

    @Override
    public String toString() {
        return "Creature{}";
    }
}
