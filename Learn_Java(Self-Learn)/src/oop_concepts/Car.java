package oop_concepts;

public class Car extends Vehicle {
    // Inheritance
    public Car(double weight, String color, String brand, boolean availability){
        super(weight, color, brand, availability);
        setName("Car");
    }

    // Polymorphism
    @Override
    public void printAvailbility(){
        String sentence = String.format("This %s availability is %b", getName(), getAvailability());
        System.out.println(sentence);
    }
}
