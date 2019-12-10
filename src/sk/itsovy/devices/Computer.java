package sk.itsovy.devices;

public class Computer extends Device implements Parameter {
    private String cpu;
    private int ram;

    public Computer(String name, String cpu, int ram) {
        super(name);
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public int getRam() {
        return this.ram;

    }

    public String getCpu() {
        return cpu;

    }
}
