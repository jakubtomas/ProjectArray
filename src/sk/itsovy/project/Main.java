package sk.itsovy.project;

public class Main {
    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{4, 5,4 ,9, 6, 7,88});

        System.out.println("Project Main.java");
        System.out.println(myArray.max());

        System.out.println(myArray.contains(3));
        System.out.println(myArray.countOfValues(4));
        System.out.println(myArray.getItem(3));

    }
}
