public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3.2, 4, "Intel", 0.5);
        RAM ram = new RAM("DDR4", 8, 0.1);
        Storage storage = new Storage("SSD", 512, 0.2);
        Display display = new Display(15.6, "IPS", 0.3);
        Keyboard keyboard = new Keyboard("membrane", true, 0.5);

        Computer computer = new Computer("Asus", "ZenBook", processor, ram, storage, display, keyboard);

        System.out.println(computer.toString());
        System.out.println(processor.toString());
        System.out.println(ram.toString());
        System.out.println(storage.toString());
        System.out.println(display.toString());
        System.out.println(keyboard.toString());
        System.out.println("Total weight: " + computer.calculateTotalWeight() + " kg");
    }
}
