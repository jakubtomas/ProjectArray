package sk.itsovy.student;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String firstName;

    private String lastName;
    private LocalDate bDay;
    private String[] subject /*= new String[0]*/;

    ArrayList<String> pole = new ArrayList<String>();


    //private String[] subject;
    public Student(String firstName, String lastName, int years, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bDay = LocalDate.of(years, month, day);

    }

    public String getFirsName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    public String toString() {
        return this.firstName + "  " + this.lastName;
    }

    public int getAge() {

        // potrebne vypocitat vek studentas
        return 0;
    }


    /*public void addSubject(String subject) {
        int numberArray = subject.length();

        String[] pomocnepole = new String[numberArray+1];

        pomocnepole[numberArray-1] = subject;

        this.subject = pomocnepole.clone();
    }*/


    public void add(String subject) {
        int permission = 1;
        for (int i = 0; i < pole.size(); i++) {
            if (pole.get(i) == subject) {
                permission = 0;
            }
        }
        if (permission == 1) {
            this.pole.add(subject);

        } else {
            System.out.println("Následujuci predmet sa už vyskytuje u žiaka");
        }

    }

    public boolean controlSubject(String subject) {
        boolean result = false;
        for (int i = 0; i <pole.size() ; i++) {
            if (pole.get(i) == subject) {
                result = true;
            }
        }
        return result;
    }



    public void showSubjects() {
        for (int i = 0; i < pole.size(); i++) {
            System.out.println(pole.get(i));
        }
    }


}

