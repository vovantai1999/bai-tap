package ke_thua_overrding;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("tôi ăn xương");
    }

    @Override
    public void makeSound() {
        System.out.println("gâu ga");;
    }
}
