package sk.itsovy.student;


import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person("aaa", "aaaa");
        Person p6 = new Person("xxx", "xxxx");
        Person p7 = new Person("yhcto", "bkskl");




        Person[] array  = new Person[] {p1 , p2 , p3 , p4,p6, p5,p7} ;


        Arrays.sort(array);

        System.out.println("===========================");
        for (Person person : array) {
            System.out.println(person.getFname() +"  "+ person.getLname());
        }


        System.out.println("=========================== number");

        int[] intArray = {4,-1,6,8,0,5,-3};


        int n = intArray.length;
        //print the original array
        System.out.println("Original Array: " + Arrays.toString(intArray));
        //call quick_sort routine using QuickSort object
        QuickSort obj = new QuickSort();
        obj.quickSort(array,0,array.length-1);
        //print the sorted array
        System.out.println("\nSorted Array: " + Arrays.toString(intArray));

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i].getFname() + " " + array[i].getLname()) ;
        }



/*
        Student erik = new Student("erik,", "poter", 2019 , 12, 20);
        Group g1 = new Group("1n", 5);




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

/*
        car mojeauto = new car("skoda", 1996, animals.cat);
        car mojeauto2 = new car("skoda", 1996, animals.cat);
        car mojeauto3 = new car("skoda", 1996, animals.cat);
        car mojeauto4 = new car("skoda", 1996, animals.cat);
        car mojeauto5 = new car("skoda", 1996, animals.cat);

        System.out.println(mojeauto.getZvieratko());
        System.out.println(car.getCount());*/
    }
}
