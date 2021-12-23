import lombok.Data;

@Data
public class PCProcessor {
    private double frequency;

    public PCProcessor(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "PCProcessor{" +
                "frequency=" + frequency +
                '}';
    }
}
