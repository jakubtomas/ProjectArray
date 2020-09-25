package sk.itsovy.sudoka.controller;

import sk.itsovy.sudoka.Board;
import sk.itsovy.sudoka.InputData;

public class SudokuSolver {

    private int[][] arr; //  1 v array mam hodnoty ktore budem pouzivat
    private Board board;

    public void start() { /// start game
        // data from file
        if (!readData()) {
            System.out.println(" data source failed");
            return; // ukonci sa funkcia
        }

        // data were upload
        // inicializovat board uvodne nastavenia
        board = new Board(arr);
        System.out.println("======================");
        board.showArray();
        System.out.println("======================");

        reduceAvailableValue();
    }

    private boolean readData() {
        // arr = new InputData().getData;
        InputData inputData = new InputData();

        if (inputData.getData() == null) {
            return false;
        } else {
            arr = inputData.getData();
            return true;
        }
    }

    public void showArray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
                if (i == 2 || i == 5) System.out.print("");   // riadok
                if (j == 2 || j == 5) System.out.print("| ");  // stlpec
            }
            System.out.println("");
        }
    }


    private void reduceAvailableValue() { // input board ,, we need input array
        //System.out.println();
        // zistit poziciu
        // from class Tile , reduce values according the values in array
        reduceAvailableValueInRow();
        reduceAvailableValueInCol();
        reduceAvailableValuesInSqr();
        reduceAvailableValueInRow();
        System.out.println(board.getTiles()[1][0].getAvailable() + " end");
    }

    private void reduceAvailableValueInRow() { // riadky hore dole
        // board.getTiles()[i][j];

       /* System.out.println(board.getTiles()[5][0].getAvailable() + " Possible value");
        System.out.println(board.getTiles()[5][0].getValue() + " Value");

        System.out.println(board.getTiles()[1][0].getAvailable() + " Possible values");
        System.out.println(board.getTiles()[1][0].getValue() + " Value");

        System.out.println("------------------");

        board.getTiles()[1][0].getAvailable().remove(4);
        System.out.println(board.getTiles()[1][0].getAvailable() + " Possible value after delete value");
*/
        System.out.println("============================================================");
        System.out.println("============================================================");
        for (int i = 0; i < 9; i++) { // riadok row
            for (int j = 0; j < 9; j++) {// stlpec column

                System.out.println(board.getTiles()[i][j].getValue() + " <.......Work fot tile");
                if (board.getTiles()[i][j].getValue() == 0) {
                    for (int k = 0; k <9 ; k++) {  // cely riadok z lava do prava meni sa len pozicia stlpca
                        //board.getTiles()[i][k].getValue();

                        // if available include number from this row delete this

                        if (board.getTiles()[i][k].getValue() >0) { // delete values only bigger than zero
                            System.out.println(" " +board.getTiles()[i][k].getValue() + " delete for " + board.getTiles()[i][j].getValue()+ " " +" [" +i+"] [" +j+ "]");
                            board.getTiles()[i][j].getAvailable().remove(board.getTiles()[i][k].getValue());
                            if (k == 8) {
                                System.out.println(board.getTiles()[i][j].getAvailable() + " After delete");
                            }
                        }
                        // podmienka ked Tile ma iba jednu available tak pridat  setValue

                    /*if (board.getTiles()[i][j].getAvailable().size() ==1) {
                        board.getTiles()[i][j].setValue();
                    }*/
                    }
                    System.out.println("--------------");
                }

            }
            System.out.println("");
        }

        System.out.println("--------");


    }


    private void reduceAvailableValueInCol() {
        System.out.println(".------------------------ reduce Available In col");
        System.out.println(".------------------------ reduce Available In col");
        System.out.println(".------------------------ reduce Available In col");
        for (int i = 0; i < 9; i++) { // riadok row
            for (int j = 0; j < 9; j++) {// stlpec column

                System.out.println(board.getTiles()[i][j].getValue() + " <.......Work fot tile");
                if (board.getTiles()[i][j].getValue() == 0) {
                    for (int k = 0; k <9 ; k++) {  // cely riadok z lava do prava meni sa len pozicia stlpca
                        //board.getTiles()[i][k].getValue();

                        // if available include number from this row delete this

                        if (board.getTiles()[k][j].getValue() >0) { // delete values only bigger than zero
                            System.out.println(" " +board.getTiles()[k][j].getValue() + " delete for " + board.getTiles()[i][j].getValue()+ " " +" [" +i+"] [" +j+ "]");

                            board.getTiles()[i][j].getAvailable().remove(board.getTiles()[k][j].getValue());
                            if (k == 8) {
                                System.out.println(board.getTiles()[i][j].getAvailable() + " After delete");
                            }
                        }
                        // podmienka ked Tile ma iba jednu available tak pridat  setValue

                    /*if (board.getTiles()[i][j].getAvailable().size() ==1) {
                        board.getTiles()[i][j].setValue();
                    }*/
                    }
                    System.out.println("--------------");
                }

            }
            System.out.println("");
        }
    }



    private void reduceAvailableValuesInSqr() { // copy from Miroslav Jackanin okay
        int k=0, l=0, m=0, n=0;
        for (int i=0; i<board.getTiles().length; i+=3){
            for (int j=0; j<board.getTiles().length; j+=3){
                for (k+=i; k<i+3; k++) {
                    for (l+=j; l<j+3; l++) {
                        if (board.getTiles()[k][l].getAvailable() == null) {
                            for (m+=i; m<i+3; m++) {
                                for (n+=j; n<j+3; n++) {
                                    if (board.getTiles()[m][n].getAvailable() != null) {
                                        board.getTiles()[m][n].remove(board.getTiles()[k][l].getValue());
                                    }
                                }
                                n=0;
                            }
                            m=0;
                        }
                    }
                    l=0;
                }
                k=0;
            }
        }
    }

    private void showPossibleValuesForTile() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("");
        }
    }


}
