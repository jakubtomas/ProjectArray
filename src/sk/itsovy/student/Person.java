package sk.itsovy.student;

import java.util.Random;

public class Person implements Comparable<Person> {

    private String fname;
    private String lname;
    private int age;


    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Person() {
        this.fname = generateString();
        this.lname = generateString();

    }

    public String getFname() {
        return fname;
    }

    public String generateString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);

        return generatedString;
    }


    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person o) {
        if (fname.equals(o.getFname()) && lname.equals(o.getFname()))
            return 0;

        if (lname.compareTo(o.getLname())>0)
            return 1;
        if (lname.compareTo(o.getLname())<0)
            return -1;

        if (fname.compareTo(o.getFname())>0)
            return 1;
        if (fname.compareTo(o.getFname())<0)
            return -1;

        return 0;

    }




    // generate the objects person


}
