class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "i5";
        comp1.memory = 8196;

        Computer comp2 = new Computer();
        comp2.processor = "AMD 5210";
        comp2.memory = 16392;

        comp1.printInfo();
        comp2.printInfo();
    }
}
