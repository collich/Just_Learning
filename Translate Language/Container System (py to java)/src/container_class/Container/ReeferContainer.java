package container_class.Container;

public class ReeferContainer extends Container {
    private float temperature;

    public ReeferContainer(int containerID, float weight, String destinationPort, float temperature){
        super(containerID, weight, destinationPort);
        this.temperature = temperature;
    }

    // Getter Method
    public float getTemperature(){
        return this.temperature;
    }

    // Setter Method
    public void setTemperature(float temperature){
        this.temperature = temperature;
    }

    @Override
    public void print(){
        String result = String.format("Reefer Container: %d Weight: %.2f Destination Port: %s Temperature: %.2f Row: %d Column: %d Stack: %d", getContainerID(), getWeight(), getDestinationPort(), getTemperature(), getRow(), getColumn(), getStack());
        System.out.println(result);
    }
}
