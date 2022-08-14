class ComputerStore {
    public static void main(String[] args) {

    ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("i5", 8196);
        Computer comp2 = factory.create("AMD 5120", 16396);

    ComputerUpgrade upgrade = new ComputerUpgrade();
    upgrade.addMemory(comp1, 4098);

        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());

    }
}
