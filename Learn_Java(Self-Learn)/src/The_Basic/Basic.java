package The_Basic;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    // Types + Encapsulation
    private int age = 69420;
    private String name = "Collin";
    private Double digits = 3.142;
    private boolean binaries = true;

    // List
    List<Integer> applicationList = new ArrayList<Integer>();

    public Basic(int age, String name, double digits, Boolean binaries){
        this.age = age;
        this.name = name;
        this.digits = digits;
        this.binaries = binaries;
    }

    // Functions
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public double getDigits(){
        return this.digits;
    }

    public boolean getBinaries(){
        return this.binaries;
    }

    public List<Integer> getList(){
        return this.applicationList;
    }
}
