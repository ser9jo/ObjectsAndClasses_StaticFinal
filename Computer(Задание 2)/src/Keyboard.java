public class Keyboard {
    private final String type;
    private final boolean backlight;
    private final double weight;

    public Keyboard(String type, boolean backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean hasBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return  "Type : " + type +
                ", Backlight : " + backlight +
                ", Weight : " + weight;
    }
}
