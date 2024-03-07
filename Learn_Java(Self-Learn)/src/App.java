import java.util.List;

import The_Basic.Basic;
import oop_concepts.Car;
import oop_concepts.Dog;
import oop_concepts.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Dog clover = new Dog("Clover", "Minced Meat");
        clover.makeSound();
    }
    
    
    // Dumping ground of knowledge
    public void oldMethods(){
        // System.out.println("Hello, World!");
        
        // Instantilise Object class
        Basic basic = new Basic(420, "Johnathon", 1.96, false);
        List<Integer> list = basic.getList();
        
        // Basic operation of list
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Basic control flow
        for (Integer i : list) {
            System.out.println(i);
        }
        
        for (int i = list.size() - 1; 0 <= i; i--){
            System.out.println(i);
        }
        
        // Classes and Object
        Vehicle v_1 = new Vehicle(100, "Red", "Ford", true);
        System.out.println(v_1.getBrand());
        
        v_1.setBrand("BMW");
        System.out.println(v_1.getBrand());
        // Vehicle v_1 = new Vehicle(100, "Red", "Ford", true);
        // System.out.println(v_1.getBrand());
        
        // v_1.setBrand("BMW");
        // System.out.println(v_1.getBrand());
        // v_1.printAvailbility();
        Car c_1 = new Car(100, "Red", "Ford", true);
        c_1.printAvailbility();
    }
}
