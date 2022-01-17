import lombok.Data;

@Data
public class PC {
    private String name;
    private PCProcessor PCProcessor;
    private int ram;

    public PC(String name, PCProcessor PCProcessor, int ram) {
        this.name = name;
        this.PCProcessor = PCProcessor;
        this.ram = ram;
    }
}
