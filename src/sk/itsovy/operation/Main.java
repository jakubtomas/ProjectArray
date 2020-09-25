package sk.itsovy.operation;

public class Main {


    public final static byte PONDELOK = 1;
    public final static byte STREDA = 4;
    public final static byte ALLWEEK = 31;


    public static void main(String[] args) {

        Student[] list = new Student[5];
        // Student student1= new Student("karol", "Novak",(byte) 1, (byte) 2, (byte) 3 , 24 );

        Student s1 = new Student("jakub", (byte) 28   , "Presov", "04001");
        System.out.println(s1.getAttWeek());

/*
        Student s1 = new Student("jakub", (byte) 23   , "Presov", "04001");
        list[0] = s1;
        list[1] = new Student("daniela", (byte) 10  , "Presov", "04001");
        list[2] = new Student("merek", (byte) 21  , "Presov", "04001");
        list[3] = new Student("anastazia", (byte) 7  , "Presov", "04001");
        list[4] = new Student("Roman", (byte) 31  , "Presov", "04001");
        */
        // vypis studentov ktory boli pondelok v skole
/*
        System.out.println("List of students, day Monday");
        for (Student student : list) {
            if ((student.getAttWeek() & PONDELOK) == 1) {
                System.out.println(" " + student.getName());
            }
        }

        // vypis studentov ktory boli pondelok v skole

        System.out.println("List of students, day Monday");
        for (Student student : list) {
            if ((student.getAttWeek() & STREDA) > 0)// vysledky nula alebo 4 {
                System.out.println(" " + student.getName());
        }

        System.out.println("List of students, all days");
        for (Student student : list) {
            if ((student.getAttWeek() & ALLWEEK) == 31)// vysledky nula alebo 4 {
                System.out.println(" " + student.getName());
        }

        list[3].setAttDay(Days.FRI);
        */
    // vypisat mena a pocet dni v skole

/*

        System.out.println("List of students, all days");
        for (Student student : list) {
            byte copyAtt = student.getAttWeek();

            int count = 0;
            for (int i = 0; i < 5; i++) {
                if ((copyAtt & 1) ==1) {
                    count++;
                    copyAtt = (byte) (copyAtt >> 1);

                }

            }
            System.out.println("  " +student.getName() + " " + count);
        }

        list[0].setHobby(Hobbies.GOLF);
        list[0].setHobby(Hobbies.HIKING);
        list[0].setHobby(Hobbies.HOCKEY);
        list[0].howHobbies();

*/

        System.out.println("Hellou ");

       /*Student.changeInt(45)*/;

    }




}


// 3 uloha

