package oop_concepts;

public class Vehicle {
    // Encapsulation for the object for Vehicle
    private double weight;
    private String color;
    private String brand;
    private boolean availability;

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

}
