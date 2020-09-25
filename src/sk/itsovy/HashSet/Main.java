package sk.itsovy.HashSet;

import sk.itsovy.abstractclass.I1;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(4);
        set.add(5);



        for (Integer t : set) {
            System.out.println(t);
        }

    }
}
