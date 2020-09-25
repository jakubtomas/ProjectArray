package sk.itsovy.sudoka;

/*100026039008700601000000200400900516000000000796004008009000000301002900640180003*/
import sk.itsovy.sudoka.controller.SudokuSolver;
import sk.itsovy.sudoka.view.View;


public class Main {
    public static void main(String[] args) {


/*        View view = new View();
        view.getData();*/

        /*InputData inputData = new InputData();
        inputData.getData();
        inputData.showArray();
*/
        SudokuSolver ss = new SudokuSolver();
        ss.start();
        ss.showArray();
        System.out.println("========================");

    }
}
// start game
// 1 upload data from text  okay
//. 2.create array according to this array  okay
//  3. delete possible values in Tile  array possible values
