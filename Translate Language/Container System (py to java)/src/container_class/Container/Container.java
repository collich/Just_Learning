package container_class.Container;

public class Container {
    private int containerID;
    private float weight;
    private String destinationPort;
    private int row;
    private int column;
    private int stack;

    public Container(int containerID, float weight, String destinationPort){
        this.containerID = containerID;
        this.weight = weight;
        this.destinationPort = destinationPort;
        this.row = 0;
        this.column = 0;
        this.stack = 0;
    }

    // Getter Methods
    public int getContainerID(){
        return this.containerID;
    }
    public float getWeight(){
        return this.weight;
    }
    public String getDestinationPort(){
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
    public void getDestinationPort(String destinationPort){
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

    // Extra methods
    public void print(){
        String result = String.format("Container: %d Weight: %.2f Destination Port: %s Row: %d Column: %d Stack: %d", getContainerID(), getWeight(), getDestinationPort(), getRow(), getColumn(), getStack());
        System.out.println(result);
    }
}
