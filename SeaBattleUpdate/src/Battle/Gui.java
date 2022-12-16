package Battle;

import static Battle.Computer.computerBoard;

public class Gui {

     static  void printBoard(String [] [] tempBoard, boolean t){
        if(t) System.out.println("\nPlayer Board ");
        else System.out.println("\nComputer Board");

        System.out.println("__________________________________");
        for(int i=0; i<tempBoard.length; i++){
            System.out.print("| ");
            for(int j=0; j<tempBoard[0].length; j++){
                System.out.print(tempBoard[i][j]);
            }
            System.out.print(" |");
            System.out.println();
        }
        System.out.print("__________________________________");
    }

    static void fillBoard(String [][]tempBoard, boolean t) {

         fillFours(tempBoard);

       for(int i=0; i<2; i++){
           fillThirds(tempBoard);
       }

       for(int i=0;i<3; i++){
           fillSeconds(tempBoard);
       }

        for (int i = 0; i < 4; i++) {
            int x = GameGo.random.nextInt(10);
            int y = GameGo.random.nextInt(10);
           if( GameGo.checkPosition(tempBoard,x,y)) tempBoard[x][y] = " 1 ";
           else {
//               fillBoard(tempBoard,t);
               x = GameGo.random.nextInt(10);
               y = GameGo.random.nextInt(10);
               tempBoard[x][y] = " 1 ";
           }

            /**       check funksiyasini qushib ketish kerak
             *
             */
        }


        printBoard(tempBoard, t);
    }



    static void fillSeconds(String[][]tempBoard){
         int  x = GameGo.random.nextInt(8);
         int y = GameGo.random.nextInt(8);

         if(x > 2 && y > 2){
             if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y + 1) ) {
                 tempBoard[x][y] = " 2 ";
                 tempBoard[x][y + 1] = " 2 ";
             }
             else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x + 1, y ) ) {
                 tempBoard[x][y] = " 2 ";
                 tempBoard[x+ 1][y ] = " 2 ";
             }
             else  if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x - 1, y ) ) {
                 tempBoard[x][y] = " 2 ";
                 tempBoard[x- 1][y ] = " 2 ";
             }
             else  if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y- 1 ) ) {
                 tempBoard[x][y] = " 2 ";
                 tempBoard[x][y-1 ] = " 2 ";
             }
         }
         else fillSeconds(tempBoard);
    }

    static void fillThirds(String[][]tempBoard) {
        int x = GameGo.random.nextInt(8);
        int y = GameGo.random.nextInt(8);

        if (x + y == (x + y) / 2 && x > 2 && y > 2 ) {
            if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y + 1) && GameGo.checkPosition(tempBoard, x , y + 2)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x][y + 1] = " 3 ";
                tempBoard[x][y + 2] = " 3 ";
            }
            else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x, y - 1) && GameGo.checkPosition(tempBoard, x, y - 2)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x][y - 1] = " 3 ";
                tempBoard[x][y - 2] = " 3 ";
            } else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x - 1, y) && GameGo.checkPosition(tempBoard, x - 2, y)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x - 1][y] = " 3 ";
                tempBoard[x - 2][y] = " 3 ";
            }
            else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x +1, y) && GameGo.checkPosition(tempBoard, x + 2, y)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x + 1][y] = " 3 ";
                tempBoard[x + 2][y] = " 3 ";
            }
            else fillThirds(tempBoard);
        }
        else if ( x <= 2 || y <= 2){
            if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y + 1) && GameGo.checkPosition(tempBoard, x , y + 2)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x][y + 1] = " 3 ";
                tempBoard[x][y + 2] = " 3 ";
            }
            else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y - 1) && GameGo.checkPosition(tempBoard, x , y - 2)) {
                tempBoard[x][y] = " 3 ";
                tempBoard[x][y - 1] = " 3 ";
                tempBoard[x][y - 2] = " 3 ";
            }else fillThirds(tempBoard);
        }
        else fillThirds(tempBoard);
    }

    static void fillFours(String[][]tempBoard){
         int x = GameGo.random.nextInt(6);
         int y = GameGo.random.nextInt(6);

         if(x < 3 && y < 3){
             if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y + 1) && GameGo.checkPosition(tempBoard, x , y + 2) && GameGo.checkPosition(tempBoard, x, y+3)) {
                 tempBoard[x][y] = " 4 ";
                 tempBoard[x][y + 1] = " 4 ";
                 tempBoard[x][y + 2] = " 4 ";
                 tempBoard[x][y + 3] = " 4 ";
             }else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x+1 ,y  ) && GameGo.checkPosition(tempBoard, x + 2, y ) && GameGo.checkPosition(tempBoard, x+3, y)) {
                 tempBoard[x][y] = " 4 ";
                 tempBoard[x][y + 1] = " 4 ";
                 tempBoard[x][y + 2] = " 4 ";
                 tempBoard[x][y + 3] = " 4 ";
             } else fillFours(tempBoard);
         }
         else if (x > 3 && y > 3){
             if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x , y + 1) && GameGo.checkPosition(tempBoard, x , y + 2) && GameGo.checkPosition(tempBoard, x, y+3)) {
                 tempBoard[x][y] = " 4 ";
                 tempBoard[x][y + 1] = " 4 ";
                 tempBoard[x][y + 2] = " 4 ";
                 tempBoard[x][y + 3] = " 4 ";
             }else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x+1,y ) && GameGo.checkPosition(tempBoard, x + 2, y ) && GameGo.checkPosition(tempBoard, x+3, y)) {
                 tempBoard[x][y] = " 4 ";
                 tempBoard[x][y + 1] = " 4 ";
                 tempBoard[x][y + 2] = " 4 ";
                 tempBoard[x][y + 3] = " 4 ";
             }else if (GameGo.checkPosition(tempBoard, x, y) && GameGo.checkPosition(tempBoard, x-1,y ) && GameGo.checkPosition(tempBoard, x - 2, y ) && GameGo.checkPosition(tempBoard, x-3, y)) {
                 tempBoard[x][y] = " 4 ";
                 tempBoard[x][y - 1] = " 4 ";
                 tempBoard[x][y - 2] = " 4 ";
                 tempBoard[x][y - 3] = " 4 ";
             }else fillFours(tempBoard);
         }else fillFours(tempBoard);

    }

}
