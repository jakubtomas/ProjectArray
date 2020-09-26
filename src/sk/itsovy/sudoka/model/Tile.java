package sk.itsovy.sudoka.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tile {
    private int value;
    private Set<Integer> available;

    public Tile(int value ) {
        this.value = value;
        this.available = new HashSet<>();
        if (value >0){
            available = null;
        }
        else{
            Integer [] temp = {1,2,3,4,5,6,7,8,9};
            Collections.addAll(available,temp); // into available push values from temp

        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public boolean contains(int value) {
        return available.contains(value);
    }


    public void remove(int value ) {
        available.remove(value);

        if (available.size() == 1 && this.value == 0 ) {
            System.out.println("priradenie " + available.toString().charAt(1));
            char number = available.toString().charAt(1);
            this.value = Integer.parseInt(Character.toString( number));
        }


    }
    public void add(int value ) {
        available.add(value);

    }

    public Set<Integer> getAvailable() {
        return available;
    }

    public int getSize() {
        if (available !=null) {
            return available.size();
        }
        return 0;
    }


}
