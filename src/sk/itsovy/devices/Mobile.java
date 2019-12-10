package sk.itsovy.devices;

public class Mobile extends Device implements Movable {
    private double diagonal;

    public Mobile(String name, double diagonal) {
        super(name);
        this.diagonal = diagonal;
    }

    @Override
    public void getDiag() {

    }
}
