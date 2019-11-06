package sk.itsovy.jakub.school;

public class Staff extends Person {

    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
}
