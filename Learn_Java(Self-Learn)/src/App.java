import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import The_Basic.Basic;
import oop_concepts.Car;
import oop_concepts.Dog;
import oop_concepts.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            // Test case 1 for try...catch
            // Scanner user_input = new Scanner(System.in);
            // System.out.println("What is your numerator: ");
            // int numerator = user_input.nextInt();
            
            // System.out.println("What is your denominator: ");
            // int denominator = user_input.nextInt();
            // user_input.close();
            
            // String sentence = String.format("Your computed value is %d", numerator/denominator);
            // System.out.println(sentence);
            
            // Test case 2 for try...catch
            List<Integer> list_of_numbers = new ArrayList<>();
            boolean continue_input = true;
            String list_lines = "";

            Scanner user_input = new Scanner(System.in);
            System.out.println("What is your number: ");
            list_of_numbers.add(user_input.nextInt());
            
            while (continue_input) {
                Character u_con_input;
                int another_number;
                System.out.println("Do you want to keep adding?... [Y/N]:");
                u_con_input = user_input.next().toUpperCase().charAt(0);
                if (u_con_input == 'N'){
                    continue_input = false;
                    user_input.close();
                    break;
                }
                System.out.println("What is your number: ");
                another_number = user_input.nextInt();
                list_of_numbers.add(another_number);
            }
            for (Integer integer : list_of_numbers) {
                list_lines += String.format(", %d", integer);
            }
            String sentence = String.format("Your list of numbers is: %s", list_lines);
            System.out.println(sentence);
        } catch (Exception e) {
            // Test case 1 for try...catch
            // System.out.println("Value cannot be divided by 0!");
        }
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

        // Abstract(Something like a template IRL, Go see Animal.java) class
        Dog clover = new Dog("Clover", "Minced Meat");
        clover.makeSound();
    }
}
