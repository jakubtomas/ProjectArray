package sk.itsovy.operation;

import sk.itsovy.jakub.school.Person;

public class Student {
    private String name;

    private byte attWeek;
    private Address address;
    public static  int count = 0;
    private  int hobby;


    public class Address {
        private String city;
        private String zip;


        public Address(String city, String zip) {
            this.city = city;
            this.zip = zip;
        }
    }


    public Student(String name, byte attWeek, String city, String zip) {
        this.name = name;
        this.attWeek = attWeek;
        this.address = new Address(city, zip); // v konstruktore som vytvoril objekt

        count++;
        System.out.println("A new Student has been created :" + count + "name  " + name);
        this.hobby = 0;
    }

    public String getName() {
        return name;
    }

    public byte getAttWeek() {
        return attWeek;
    }


    public void setHobby(Hobbies hobby) {
        switch (hobby) {
            case DANCING : this.hobby |=1; break; // and continue
            case FOOTBALL : this.hobby |=2; break;
            case HOCKEY:  this.hobby |=3; break;
            case GOLF: this.hobby |=4; break;
            case PROGRAMING : this.hobby |=5; break;
            case HIKING : this.hobby |=6; break;
            case TRAVELING : this.hobby |=7; break;
        }

    }

    public boolean hasHobby(Hobbies h) {
        switch (h) {
            case DANCING:  return (this.hobby & 1) == 1;
            case FOOTBALL: return (this.hobby & 2) == 2;
            case HOCKEY: return (this.hobby & 4) == 4;
            case GOLF: return (this.hobby & 8) == 8;
            case PROGRAMING: return (this.hobby & 16) == 16;
            case HIKING: return (this.hobby & 32) == 32;
            case GAMING: return (this.hobby & 64) == 64;
            case TRAVELING: return (this.hobby & 128) == 128;
            default: return false;
        }
    }

    public void howHobbies() {
        System.out.println("List of students, all days");

        int copyint = hobby;
        int count = 0;
        for (int i = 0; i <8 ; i++) {
            if ((copyint & 1) == 1) {
                count++;
                copyint = (byte) (copyint >> 1);
            }

        }
        System.out.println( "Number of hobbies is " + count);

    }
        /*for (Student student : in) {
            byte copyAtt = student.getAttWeek();

            int count = 0;
            for (int i = 0; i < 5; i++) {
                if ((copyAtt & 1) ==1) {
                    count++;
                    copyAtt = (byte) (copyAtt >> 1);

                }

            }
            System.out.println("  " +student.getName() + " " + count);
        }*/





    public void setAttDay(Days day) {
        switch (day) {
            case MON: this.attWeek= (byte)(this.attWeek | 1); break;
            case TUE: this.attWeek= (byte)(this.attWeek | 2); break;
            case WED: this.attWeek= (byte)(this.attWeek | 3); break;
            case THU: this.attWeek= (byte)(this.attWeek | 4); break;
            case FRI: this.attWeek= (byte)(this.attWeek | 5); break;
        }
    }


    public static int changeInt(int a, int b) {

        int count = 0;
        while (a>0 && b>0) {
            if (((a&1) == 1) && ((b&1) == 1)){
                   count++;
            }

            a = a >> 1;
            b = b >> 1;

        }


        return count;
    }


    public byte getWeek() {
        return this.attWeek;
    }
}
