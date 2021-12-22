import lombok.Data;

@Data
public class PC {
    private String name;
    private Processor processor;
    private int ram;

    public PC(String name, Processor processor, int ram) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + ", " + processor +
                ", ram=" + ram +
                '}';
    }
}
