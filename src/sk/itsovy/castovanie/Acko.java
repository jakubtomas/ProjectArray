package sk.itsovy.castovanie;

public class Acko {
    public String name;
    private int age;
    protected int heigh;

    protected String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeigh() {
        return heigh;
    }


    public Acko(String name, int age, int heigh) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
    }

    public void hi() {
        System.out.println("hellou i am from acko");
    }






}
