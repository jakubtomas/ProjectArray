package sk.itsovy.project;

import java.util.Random;

public class MyArray implements ArrayMethods {

    private int[] arr;

    private int size;

    public MyArray(int size) {/// toto je konstruktor
        if (size <=0) {
            System.out.println("erorr message");
            // error
        }

        this.size = size;
        this.arr = new int[size];      // pri vyttvoreni pola poviem kolko

        resetArrayToZero();
    }

    public MyArray(int[] input) {   // posielame pole ktore ulozime
        this.arr = input;
        this.size = input.length;
    }

    public int getSize() { // geter pre size
        return size;
    }


    //funkcia ktora  nastavuje vsetky hodnoty na nulu
    private void resetArrayToZero() {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    @Override // this means metoda bola prepisane odniekadial ju mame
    public double getAverageValue() {
        double count = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            System.out.println(count);
        }


        average = count / (arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }


        return average;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        //System.out.println(min);
        return min;
    }

    @Override
    public int max() {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        //System.out.println(max);
        return max;
    }

    @Override // volitelna
    public int min2() {
        //throw new NotS

       /* System.out.println(" this app not supported min2");
        System.out.println(" this app not supported min2");
        system.ex
        return 0;*/

        return 0;
    }

    @Override
    public int max2() {
        return 0;
    }

    @Override
    public void generateValue(int a, int b) {

        Random rn = new Random();


        for (int i = 0; i < arr.length; i++) {
            int temp = rn.nextInt(80) + 1;
            arr[i] = temp;
        }


    }

    @Override
    public boolean contains(int value) {

        boolean existvalue = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                existvalue = true;
            }
        }

        return existvalue;
    }

    @Override
    public int countOfValues(int value) { // kolko krat sa nachadza cislo value
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value ) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countOfEvenValues() {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=  1 ;
        }
    }

    @Override
    public void sort(boolean asc) {

    }

    @Override
    public void addItem(int newvalue) {

    }

    @Override
    public void addItem(int newvalue, int position) {

    }

    @Override
    public int[] copy() {
        return new int[0];
    }

    @Override
    public int getItem(int position) {

        return arr[position];
    }


    // metody

}
