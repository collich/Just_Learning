package oop_concepts;

// Abstraction
abstract class Animal {
    private String name = "Animal";
    private String food = "Generic Food";

    public Animal(String name, String food){
        this.name = name;
        this.food = food;
    }

    public abstract void Talk();

    // Getters
    public String getName(){
        return this.name;
    }

    public String getFood(){
        return this.food;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setFood(String food){
        this.food = food;
    }

    public void makeSound(){
        String sentence = String.format("The %s is eating %s and it's making a sound.", getName(), getFood());
        System.out.println(sentence);
    }
}
