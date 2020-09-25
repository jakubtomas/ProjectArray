package sk.itsovy.castovanie;

public class Cecko extends Becko  {

    public Cecko(String name, int age, int heigh) {
        super(name, age, heigh);
    }

    @Override
    public void hi() {
       // System.out.println("hello i am from cecko");
        super.hi();
    }

    public void hellou() {
        System.out.println("hellou only from cecko cecko cecko");
    }
}
