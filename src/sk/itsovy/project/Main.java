package sk.itsovy.project;

public class Main {
    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{88, 988,8 ,7, 6,8});

        System.out.println("Project Main.java");
        System.out.println("Toto je max " + myArray.max());
        System.out.println("Toto je druhe max " + myArray.max2());
        System.out.println("--------------");
        System.out.println("Toto je najmensie cislo  "+ myArray.min());
        System.out.println("Toto je druhe najmensie cislo  " +myArray.min2());

        System.out.println(myArray.contains(3));
        System.out.println(myArray.countOfValues(4));
        System.out.println(myArray.getItem(3));

    }
}
