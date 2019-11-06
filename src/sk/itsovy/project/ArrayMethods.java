package sk.itsovy.project;

public interface ArrayMethods  {

    public double getAverageValue();

    public int min();

    public int max();

    //druhy najmensi
    public int min2();

    //doprovolna metoda
    //zavolame vynimku
    public int max2();

    public void generateValue(int a, int b); // rozsah

    public boolean contains(int value);

    public int countOfValues(int value);

    public int countOfEvenValues();

    public void incrementValues();  // kazde cislo zvacsi o jedno

    public  void sort(boolean asc );//

    public void addItem(int newvalue);// add new value into array

    public void addItem(int newvalue , int position);  // volitelna  prida cislo na new poziciu

    public int[] copy();

    public int getItem(int position); // na akej pozici


}
