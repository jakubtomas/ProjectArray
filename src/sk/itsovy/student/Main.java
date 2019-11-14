package sk.itsovy.student;


import java.util.Date;

public class Main {
    public static void main(String[] args) {


        System.out.println("Student ");


        Student erik = new Student("erik,", "poter", 2019 , 12, 20);
        Group g1 = new Group("1n", 5);




        erik.add("MATH");
        erik.add("MATH");
        erik.add("EKO");
        erik.add("PGO");
        erik.add("PHY");
        erik.showSubjects();
        System.out.println(erik.controlSubject("MATH"));



    }
}
