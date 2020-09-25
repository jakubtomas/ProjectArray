package sk.itsovy.sudoka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputData {

    private int[][] arr = new int[9][9];

    public int[][] getData() {
        try {
            String data = null;
            File myObj = new File("C://Users//install//IdeaProjects//ProjectArray//src//sk//itsovy//sudoka//SudokuDemo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();


            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    assert data != null;
                    arr[i][j] = (data.charAt(9 * i + j) - '0');

                }

            }
            return arr;

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;

    }

    public void showArray() {
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
                 if (j==2 || j==5) System.out.print("| ");  // stlpec
                 if (i==2 || i==5) System.out.print("");   // riadok
            }
            System.out.println("");
        }
    }

}
