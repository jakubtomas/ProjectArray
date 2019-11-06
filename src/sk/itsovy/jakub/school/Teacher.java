package sk.itsovy.jakub.school;

public class Teacher extends Person  {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("I am constructor  Teacher ");
    }


    public double getSalary() {
        return salary;
    }
}


// co je super  ,, extends

// deklaracia metody ze taka metoda existuje
// interface obsahuje zoznam metod ktoru musi mat metoda
// že musia mat getSalary  pri

//  zapis public class Teacher implements Bicykel

// trieda teacher musi obsahovat všetky metody definovane rozhranim Bicykel
/// implements ----nanutime metody z emploeyy  z interface
// interface je vlastne zoznam funkcie
/// ked  ked pouzijem interface to znamena ze musim vytovrit metodu ktora sa
// bude volat ako metoda v interface

// interface urcuje pravidla  napriklad aby niekto nepouzil dajPlat namiesot getSalary
// kazda trieda  musi mat predka ale rozhranie nemusi mat

/*
package  orgranizuje sadu suvisiacich tried  , umiestnenim tried do balicka zapezpecim komunikaciu
asdlkfjf*/
