package ke_thua_overrding;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test dog:");
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
        d.eat();

        System.out.println("-----");
        System.out.println("Test Cat:");
        Cat c = new Cat();
        d.makeSound();
        d.sleep();
        d.eat();

        System.out.println("-----");
        System.out.println("Test Bird:");
        Bird b = new Bird();
        d.makeSound();
        d.sleep();
        d.eat();

        System.out.println("-------");
        Dragon r = new Dragon();
        r.makeSound();
        r.sleep();
        r.eat();
    }
}
