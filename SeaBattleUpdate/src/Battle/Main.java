package Battle;

import static Battle.Computer.computerBoard;
import static Battle.Computer.countComputer;
import static Battle.Player.countPlayer;
import static Battle.Player.playerBoard;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Gui.printBoard(playerBoard,true);
        Gui.printBoard(computerBoard,false);
        Gui.fillBoard(playerBoard,true);
        Gui.fillBoard(computerBoard,false);
        while (GameGo.game){
            GameGo.shoot();
            GameGo.checkExcistence();
        }
        
        if(countPlayer > countComputer) System.out.println("\n**********Player win********* \nHisob " + countPlayer + " --- " + countComputer );
        else System.out.println("\n*************Computer win**********\nHisob " + countPlayer + " --- " + countComputer);
    }
}
