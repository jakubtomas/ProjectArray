package sk.itsovy.student;

public class car {

    private String name;
    private int year;

    private animals zvieratko;

    private static int count = 0;

    public car(String name, int year, animals zvieratko) {
        this.name = name;
        this.year = year;
        this.zvieratko = zvieratko;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public animals getZvieratko() {
        return zvieratko;
    }



    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        car.count = count;
    }
}
