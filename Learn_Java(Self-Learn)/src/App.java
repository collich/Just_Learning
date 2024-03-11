import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import The_Basic.Basic;
import The_Basic.FileHandling;
import oop_concepts.Car;
import oop_concepts.Dog;
import oop_concepts.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
                // --------------------
        /* File Handling */
        try {
            FileHandling file_Handling = new FileHandling();
            Scanner fileScanner = new Scanner(System.in);
            Character caseInput;
            String filename;
            String bodyContext;
            
            System.out.println("What would you like to do: (Write/[W], Read/[R], Add Line/[A], Replace/[P])");
            caseInput = fileScanner.nextLine().toUpperCase().charAt(0);

            System.out.println("What's your file name: ");
            filename = fileScanner.nextLine();
            // Let user interact with the program
            switch (caseInput) {
                /* Write Case */
                case 'W':
                System.out.println("What is the line you want to write: ");
                bodyContext = fileScanner.nextLine();
                // Writing File
                file_Handling.writeFile(filename, bodyContext);

                /* Read Case */
                case 'R':
                // Read file
                file_Handling.readFile(filename);
                
                // Append Case
                case 'A':
                List<String> list_of_sentence = new ArrayList<>();
                boolean conditional_while = true;
                Character continueQuestionMark;
                
                while (conditional_while) {
                    System.out.println("What is the line you want to write: ");
                    bodyContext = fileScanner.nextLine();
                    
                    file_Handling.appendFile(filename, bodyContext);
                    
                    list_of_sentence.add(bodyContext);
                    
                    System.out.println("Do you want to continue adding? [Y/N]");
                    continueQuestionMark = fileScanner.nextLine().toUpperCase().charAt(0);
                    
                    if (continueQuestionMark == 'N'){
                        conditional_while = false;
                    }
                }
                
                System.out.println("The sentence that have been added:");
                for (String string : list_of_sentence) {
                    System.out.println(string);
                }

                case 'P':
                    
                
                // default:
                //     break;
                
            }
            fileScanner.close();
            
        } catch (Exception e) {
            // System.out.println("File unable to be open or does not exist: " + e.getMessage());
            // e.printStackTrace();
        }
    }
    
    
    // Dumping ground of knowledge
    public void oldMethods(){
        // --------------------
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
        
        // --------------------
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
        
        
        // --------------------
        /* Try Catch */
        // Try... Catch block
        try {
            /* ---Test case 1 for try...catch--- */
            // Scanner user_input = new Scanner(System.in);
            // System.out.println("What is your numerator: ");
            // int numerator = user_input.nextInt();
            
            // System.out.println("What is your denominator: ");
            // int denominator = user_input.nextInt();
            // user_input.close();
            
            // String sentence = String.format("Your computed value is %d", numerator/denominator);
            // System.out.println(sentence);
            
            /* ---Test case 2 for try...catch--- */ 
            //Initialise variables
            List<Integer> list_of_numbers = new ArrayList<>();
            boolean continue_input = true;
            String list_lines = "";
            Scanner user_input = new Scanner(System.in);
            
            // Asking the user their input
            System.out.println("What is your number: ");
            list_of_numbers.add(user_input.nextInt());
            
            // While loop to ask user if they want to continue adding to the Array
            while (continue_input) {
                // Initialise 
                Character u_con_input;
                int another_number;
                // Asking user if they want to continue
                System.out.println("Do you want to keep adding?... [Y/N]:");
                u_con_input = user_input.next().toUpperCase().charAt(0);
                // Guard clause to check if they wants to continue.
                if (u_con_input == 'N'){
                    continue_input = false;
                    break;
                }
                // Else execute this.
                System.out.println("What is your number: ");
                another_number = user_input.nextInt();
                list_of_numbers.add(another_number);
            }
            // For each block to print out a list.
            for (Integer integer : list_of_numbers) {
                list_lines += String.format(", %d", integer);
            }
            // Allow users to check their number in the List interface
            System.out.println("Which index in your list you want to access:");
            int index = user_input.nextInt()  - 1;
            
            user_input.close();
            
            System.out.println(list_of_numbers.get(index));
            String sentence = String.format("Your list of numbers is: %s", list_lines);
            System.out.println(sentence);
        } catch (Exception e) {
            // Test case 1 for try...catch
            // System.out.println("Value cannot be divided by 0!");
            System.out.println("Hold up...Something ain't right");
            
        }
        
        
        // --------------------
        /* Collections Framwork*/
        // Creating a list
        List<String> my_list_of_pl = new ArrayList<>();
        my_list_of_pl.add("Python");
        my_list_of_pl.add("JavaScript");
        my_list_of_pl.add("Ruby");
        my_list_of_pl.add("GoLang");
        my_list_of_pl.add("Java");
        System.out.println("\nLooping through a list/array: ");
        
        // To loop a list
        for (String string : my_list_of_pl) {
            System.out.println(string);
        }
        
        // Creating a set
        Set<Integer> my_new_set = new HashSet<>();
        my_new_set.add(10);
        my_new_set.add(20);
        my_new_set.add(30);
        System.out.println("\nLooping through a set: ");
        
        // To loop through a set
        for (Integer integer : my_new_set) {
            System.out.println(integer);
        }
        
        // Creating a Map (key-value)
        Map<String, Integer> my_keyvalue_map = new HashMap<>();
        my_keyvalue_map.put("John",10);
        my_keyvalue_map.put("Bobby",30);
        my_keyvalue_map.put("Claire",50);
        my_keyvalue_map.put("Diane",95);
        
        System.out.println("\nLooping through Hashmap: ");
        // for looping through each map
        for (Map.Entry<String, Integer> entry : my_keyvalue_map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            
        }
        

    }
}
