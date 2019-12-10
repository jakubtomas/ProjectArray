package sk.itsovy.student;


import java.util.Date;

public class Main {
    public static void main(String[] args) {


       // System.out.println("Student ");


        Student erik = new Student("erik,", "poter", 2019 , 12, 20);
        Group g1 = new Group("1n", 5);
/*




        erik.add("MATH");
        erik.add("MATH");
        erik.add("EKO");
        erik.add("PGO");
        erik.add("PHY");
        erik.showSubjects();
        System.out.println(erik.controlSubject("MATH"));
*/

/*
        animals valueA = animals.monkey;
        weapons valueb = weapons.ak47;
        computer valuec = computer.asus;



        System.out.println(valueA);
        System.out.println(valueb);
        System.out.println(valuec);*/


        car mojeauto = new car("skoda", 1996, animals.cat);
        car mojeauto2 = new car("skoda", 1996, animals.cat);
        car mojeauto3 = new car("skoda", 1996, animals.cat);
        car mojeauto4 = new car("skoda", 1996, animals.cat);

        System.out.println(mojeauto.getZvieratko());
        System.out.println(car.getCount());
    }
}
