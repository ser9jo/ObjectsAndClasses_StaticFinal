public class Display {
    private final double diagonal;
    private final String type;
    private final double weight;

    public Display(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Display = " + type +
                ", Diagonal = " + diagonal +
                ", Weight = " + weight;
    }
}
