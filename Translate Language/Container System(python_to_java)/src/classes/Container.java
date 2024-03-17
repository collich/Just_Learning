package classes;

public class Container {
    private int containerID;
    private float weight;
    private int destinationPort;
    private int row;
    private int column;
    private int stack;

    public Container(int containerID, float weight, int destinationPort){
        this.containerID = containerID;
        this.weight = weight;
        this.destinationPort = destinationPort;
        this.row = 0;
        self.column = 0;
        self.stack = 0;
    }

    // Getter Methods
    public int getContainerID(){
        return this.containerID;
    }
    public float getWeight(){
        return this.weight;
    }
    public int getDestinationPort(){
        return this.destinationPort;
    }
    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }
    public int getStack(){
        return this.stack;
    }
    
    // Setter Methods
    public void getContainerID(int containerID){
        this.containerID = containerID;
    }
    public void getWeight(float weight){
        this.weight = weight;
    }
    public void getDestinationPort(int destinationPort){
        this.destinationPort = destinationPort;
    }
    public void getRow(int row){
        this.row = row;
    }
    public void getColumn(int column){
        this.column = column;
    }
    public void getStack(int stack){
        this.stack = stack;
    }

}
