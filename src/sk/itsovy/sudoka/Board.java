package sk.itsovy.sudoka;

import sk.itsovy.sudoka.model.Tile;

public class Board {
    private Tile[][] tiles;

    public Tile[][] getTiles() {
        return tiles;
    }

    public Board(int[][] arr) { // prijme pole
        this.tiles = new Tile[9][9];

        // priradenie do  pola objekty
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tiles[i][j] = new Tile(arr[i][j]);
            }
        }
    }

    //reduceAvailableValue();

    ///  vvtvori
    // do pola  vlozim objekty Tile kde sa nastavia pomocou konstruktora value a hodnoty 1 az 9
    // Zistim kde je iba jeden volny Tile a  priradim cislo  nasledne zistim dalsie volne miesta , cyklus sa bude opakovat do vtedy dokial
    // riadok stlpec a stvorec bude mat viac ako 2 prazdne Tile,, potom prioritne si vyberiem tam kde prazdne


    public void showArray() {
        /*for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tiles[i][j].getValue() + " ");
                if (j == 2 || j == 5) System.out.print("| ");  // stlpec
                if (i == 2 || i == 5) System.out.print("");   // riadok
            }
            System.out.println("");
        }*/

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    System.out.print("   ");
                }
                System.out.print(tiles[i][j].getValue() + " ");
            }
            System.out.println();
        }
    }

}
