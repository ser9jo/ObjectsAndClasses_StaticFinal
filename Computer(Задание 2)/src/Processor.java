public class Processor {
    private final double frequency;
    private final int cores;
    private final String manufacturer;
    private final double weight;

    public Processor(double frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Manufacturer : " + manufacturer +
                ", Frequency : " + frequency +
                ", Cores : " + cores +
                ", Weight : " + weight;
    }
}
