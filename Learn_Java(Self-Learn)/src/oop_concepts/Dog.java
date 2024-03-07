package oop_concepts;

public class Dog extends Animal{
    public Dog(String name, String food){
        super(name, food);
    }

    public void Talk(){
        System.out.println("Bark Bark");
    }

    @Override
    public void makeSound(){
        String sentence = String.format("%s loves eating %s", getName(), getFood());
        System.out.println(sentence);
    }
}
