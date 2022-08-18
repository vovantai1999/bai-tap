package static_property;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
         numberOfCars++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    void display(){
        System.out.println(name + " " + engine );


//    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + name + '\'' +
//                ", engine='" + engine + '\'' +
//                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("MAZDA 3","V6");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("TOYOTA VIOS","v8");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("HONDA CIVIC","v7");
        System.out.println(Car.numberOfCars);

        car1.display();
        car2.display();
        car3.display();
        }
    }



