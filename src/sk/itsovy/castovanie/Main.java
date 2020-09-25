package sk.itsovy.castovanie;

import sk.itsovy.abstractclass.Dog;
import sk.itsovy.abstractclass.Horse;
import sk.itsovy.abstractclass.I1;
import sk.itsovy.abstractclass.Pug;

public class Main {



    public static void main(String[] args) {

        System.out.println("welcome to catovanie ");

        Acko acko = new Acko("Peter", 18, 177);


        Acko a = new Cecko("Jakub", 45 , 188);
        a.hi();

        ((Cecko)a).hellou();

        a.hi();

        ((Cecko)a).hellou();

}
}

// 3 uloha

