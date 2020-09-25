package sk.itsovy.abstractclass;

import sk.itsovy.operation.Days;
import sk.itsovy.operation.Hobbies;
import sk.itsovy.operation.Student;

public class Main {



    public static void main(String[] args) {


        I1 a1 = new Dog();
        a1.sound();

        I1 a3 = new Pug();

        a3.getPicture();
        a3.sound();
        //a3.Pug();

        ((Pug) a3).Pug();



        Object a2 = new Horse();

        System.out.println("===============");
        I1 dog = new Pug();
        dog.sound();

        ((Pug) dog).sound();

        //((Horse)a2).sound();





}
}

// 3 uloha

