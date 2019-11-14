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
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        //System.out.println(min);
        return min;
    }

    @Override
    public int max() {

        int max = arr[0];     //20
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


    if (size > 0) {

        int min = min();

        int value = arr[0];
        if (value == min) {
            value = arr[1];
        }
        for (int i = 1; i < arr.length; i++) {

            if ( arr[i] < value && arr[i] > min ) {
                value = arr[i];
            }

            //

        }



        return value;
    }else{
        error("Incorrect array size: " + size);
        return 0;
    }

    }






    @Override
    public int max2() {
        if (size > 0) {
            int max = max();



            int value = arr[0];

            if (value == max) {
                value = arr[1];
            }
            for (int i = 1; i < arr.length; i++) {


                if (arr[i] > value && arr[i] < max ) {
                    value = arr[i];
                }

            }

            return value;
        }else{
            error("Incorrect array size: " + size);
            return 0;
        }

    }

    @Override
    public void generateValue(int a, int b) {



        Random rn = new Random();


        for (int i = 0; i < arr.length; i++) {
            int temp = rn.nextInt(b-a+1) + a;
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
        int i ,j,temp;
        for ( i = 0; i <size-1 ; i++) {

            /*for (int j = 0; j < size-1-i; j++) {
                if (asc == true && arr[j] > arr[j] + 1) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }*/
        }
    }

    @Override
    public void addItem(int newValue) {

         // zistim dany pocet pola
        // vytvorim nove pole  o 1 väčšie a na pozici b.length pridam newValue
        int numberArray = arr.length;

        int[] arr2 = new int[numberArray+1];

        arr2[numberArray] = newValue;

    }

    @Override
    public void addItem(int newvalue, int position) {

        int dlzka  = arr.length;
        int[] helparray = new int[dlzka+1];

        // priradenie
        for (int i = 0; i <dlzka ; i++) {
            helparray[i] = arr[i];
        }

        for ( int x=helparray.length; x > position ; x--) {

            if (x == 1) {
                helparray[1] = helparray[0];
            } else {
                helparray[x-1] = helparray[x-2];

            }

        }
        helparray[position] = newvalue;

        this.arr = helparray;

        for (int i = 0; i <helparray.length ; i++) {
            System.out.print(" " + helparray[i] );
        }

    }

    @Override
    public int[] copy() {
        /*int[] array = {23, 43, 55, 12};
        int newLength = array.length;

        int[] copiedArray = Arrays.copyOf(array, newLength);*/


        int [] copieArray = arr.clone();


        return copieArray;
    }

    @Override
    public int getItem(int position) {

        return arr[position];
    }


    public void error(String message) {
        System.out.println(message);
        System.exit(1);

    }

    // metody

}
