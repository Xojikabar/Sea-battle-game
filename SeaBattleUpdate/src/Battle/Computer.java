package Battle;

public class Computer {
    static int countComputer = 0;
    static String [][]computerBoard = new String[][]{
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - " , " - " ," - "," - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - ", " - ", " - ", " - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - ", " - ", " - ", " - "," - ", " - ", " - ", " - ", " - "},
            {" - " , " - ", " - ", " - ", " - "," - ", " - ", " - ", " - ", " - "},
            {" - ", " - ", " - ", " - ", " - "," - ", " - ", " - ", " - ", " - "}
    };

    static String [][]cloneComputerBoard = computerBoard.clone();
}
