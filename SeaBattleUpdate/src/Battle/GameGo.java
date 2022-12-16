package Battle;

import java.util.Random;
import java.util.Scanner;

import static Battle.Computer.computerBoard;
import static Battle.Player.playerBoard;

public class GameGo {
    static boolean game = true;
    static Random random = new Random();

    /**
     * Shows the players turn
     * @throws InterruptedException
     */

    static void shoot() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nYour turn enter position x = ");
        int x = scan.nextInt();
        System.out.print("Enter position y = ");
        int y = scan.nextInt();

        checkTarget(computerBoard,x,y,false);
//        Thread.sleep(5000);
        x = random.nextInt(10);
        y = random.nextInt(10);
        checkTarget(playerBoard,x,y,true);
    }

    /**
     * Checks the shoot on target
     * @param tempBoard
     * @param x
     * @param y
     * @param v
     */
    static void checkTarget(String [][] tempBoard, int x, int y,boolean v ){

        if(tempBoard[x][y].equals(" 1 ") || tempBoard[x][y].equals(" 3 ") || tempBoard[x][y].equals(" 4 ")|| tempBoard[x][y].equals(" 2 ")) {
            tempBoard[x][y] = " X ";

            if(!v) {
                Scanner scanner = new Scanner(System.in);
                Player.countPlayer++;
                Gui.printBoard(tempBoard,v);
                System.out.print("\n Again Your turn enter position x = ");
                int i = scanner.nextInt();
                System.out.print("Enter position y = ");
                int j = scanner.nextInt();
                checkTarget(tempBoard,i,j,v);
            }
            else {

                Computer.countComputer++;
                Gui.printBoard(tempBoard,v);
                int i = random.nextInt(10);
                int j = random.nextInt(10);
                Gui.printBoard(tempBoard,v);
            }


        }
        else tempBoard[x][y] = " O ";
        Gui.printBoard(tempBoard,v);
    }


    /**
     *  static again shoot
     */




    /**
     * checks is game over
     */

    static  void checkExcistence(){
        if(Player.countPlayer == 20 || Computer.countComputer == 20 )game = false;
    }




    static boolean checkPosition(String [][]tempBoard, int x, int y){
//        || tempBoard[x][y].equals(" O ")|| tempBoard[x][y].equals(" X ")
        if(tempBoard[x][y].equals(" 1 ") || tempBoard[x][y].equals(" 3 ") || tempBoard[x][y].equals(" 4 ")|| tempBoard[x][y].equals(" 2 ") )return false;

        return true;
    }
}
