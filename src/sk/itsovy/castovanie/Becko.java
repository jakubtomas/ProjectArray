package sk.itsovy.castovanie;

public class Becko extends Acko{

    private int number;

    public Becko(String name, int age, int heigh) {
        super(name, age, heigh);

    }



    @Override
    public void hi() {
        System.out.println("hellou iam from becko");
        System.out.println(getName());

    }
}
