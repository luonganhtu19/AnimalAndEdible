package Entity;

import function.Animal;
import function.Edible;

public class Chicken  extends Animal implements Edible {
    @Override
    public String howtoEat() {
        return "Fruit";
    }
    @Override
     public String makeSound() {
        return "o o o o o";
    }
}
