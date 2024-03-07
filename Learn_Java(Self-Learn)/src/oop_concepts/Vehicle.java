package oop_concepts;

public class Vehicle {
    // Encapsulation for the object for Vehicle
    private double weight;
    private String color;
    private String brand;
    private boolean availability;
    private String name = "Vehicle";

    // Constructor
    // Method Overloading
    public Vehicle(double weight, String color, String brand, boolean availability){
        this.weight = weight;
        this.color = color;
        this.brand = brand;
        this.availability = availability;
    }

    public Vehicle(double weight, String color, String brand){
        this.weight = weight;
        this.color = color;
        this.brand = brand;
        this.availability = true;
    }

    public Vehicle(double weight, String color){
        this.weight = weight;
        this.color = color;
        this.brand = "Ford";
        this.availability = true;
    }

    public Vehicle(double weight){
        this.weight = weight;
        this.color = "Red";
        this.brand = "Ford";
        this.availability = true;
    }

    // Getter functions
    public double getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
    public String getBrand() {
        return this.brand;
    }
    public boolean getAvailability(){
        return this.availability;
    }
    public String getName(){
        return this.name;
    }


    //Setter functions
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    public void setName(String name){
        this.name = name;
    }

    // General Method for this class
    public void printAvailbility(){
        String sentence = String.format("This %s availability is %b", getName(), getAvailability());
        System.out.println(sentence);
    }

}
