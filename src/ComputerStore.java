class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "i5";
        comp1.memory = 8196;

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 8196);

        comp1.printInfo();
        System.out.println(comp1.getInfo());

    }
}
