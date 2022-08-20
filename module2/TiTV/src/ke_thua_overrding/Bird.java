package ke_thua_overrding;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }

    public void eat() {
        System.out.println("Tôi ăn sâu ");
    }

    public void makeSound() {
        System.out.println("líu lo");
    }
}
