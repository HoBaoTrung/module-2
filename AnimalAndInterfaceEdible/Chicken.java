package AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cuk cuk";
    }

    @Override
    public String howToEat() {
        return "fry";
    }
}
