package class_animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return("Gà gáy chiếp chiếp ");
    }

    @Override
    public String howtoEat() {
        return("ăn sả ớt");
    }
}
