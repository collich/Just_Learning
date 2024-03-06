import java.util.List;

import The_Basic.Basic;

public class App {
    public static void main(String[] args) throws Exception {
        
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
        
    }
}
