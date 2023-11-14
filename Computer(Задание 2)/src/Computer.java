public class Computer {
        private final String manufacturer;
        private final String name;
        private Processor processor;
        private RAM ram;
        private Storage storage;
        private Display display;
        private Keyboard keyboard;

    public Computer(String manufacturer, String name, Processor processor, RAM ram, Storage storage, Display display, Keyboard keyboard) {
            this.manufacturer = manufacturer;
            this.name = name;
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
            this.display = display;
            this.keyboard = keyboard;
        }

        public double calculateTotalWeight() {
            return processor.getWeight() + ram.getWeight() + storage.getWeight() + display.getWeight() + keyboard.getWeight();
        }
    public String toString() {
        return "Computer";
    }
}