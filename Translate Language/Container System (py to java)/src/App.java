import container_class.Container.Container;
import container_class.Container.ReeferContainer;

public class App {
    public static void main(String[] args) {
        Container container = new Container(1, 17.52f, "Singapore, 20");
        container.print();
        ReeferContainer reeferContainer = new ReeferContainer(1, 56.25f, "Singapore, 21", 21.3f);
        reeferContainer.print();
    }
}
