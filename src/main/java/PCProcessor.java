import lombok.Data;

@Data
public class PCProcessor {
    private double frequency;

    public PCProcessor(double frequency) {
        this.frequency = frequency;
    }
}
