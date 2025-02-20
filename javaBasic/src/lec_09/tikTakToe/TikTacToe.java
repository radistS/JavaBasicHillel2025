package lec_09.tikTakToe;

/*

1. draw board
2. turns
3. calculate winner

 1 2 3
 4 5 6
 7 8 9



 */

import java.util.Scanner;

public class TikTacToe {

    public static void main(String[] args) {
        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int maxTurnNumber = 9;
        int turnNumber = 0;
        String whoseTurn = "X";

        while (turnNumber <= maxTurnNumber){
            printBoard(board);
            turnEngine(whoseTurn, board);

            if (calculateWinn(board, whoseTurn)){
                System.out.printf("Congratulation '%S'. You won!!!!", whoseTurn);
                break;
            } else if (turnNumber == 9){
                System.out.println("Draw!!!");
            }
            else {
                turnNumber++;
                whoseTurn = (whoseTurn.equals("X") ? "0" : "X");
                continue;
            }
        }
        printBoard(board);
    }

    private static String winnerString(String whoseTurn){
        return whoseTurn + whoseTurn + whoseTurn;
    }

    /*
    0 1 2
    3 4 5
    6 7 8
     */

    private static boolean calculateWinn(String[] board, String whoseTurn){
        return ((board[0] + board[1] + board[2]).equals(winnerString(whoseTurn)))  // - 1
            || ((board[3] + board[4] + board[5]).equals(winnerString(whoseTurn)))  // - 2
            || ((board[6] + board[7] + board[8]).equals(winnerString(whoseTurn)))  // - 3
            || ((board[0] + board[4] + board[8]).equals(winnerString(whoseTurn)))  //  \
            || ((board[2] + board[4] + board[6]).equals(winnerString(whoseTurn)))  //  /
            || ((board[0] + board[3] + board[6]).equals(winnerString(whoseTurn)))  // |1
            || ((board[1] + board[4] + board[7]).equals(winnerString(whoseTurn)))  // |2
            || ((board[2] + board[5] + board[8]).equals(winnerString(whoseTurn))); // |3
    }

    private static void turnEngine(String whoseTurn, String[] board) {
        do{
            System.out.printf("Player %s please do your turn (push button form 1 to 9)... ", whoseTurn);
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i < 1 || i > 9) {
                System.out.println("incorrect input");
                continue;
            }

            if (Character.isDigit(board[i - 1].charAt(0))) {
                board[i - 1] = whoseTurn;
                break;
            } else {
                System.out.println("place is taken");
            }

            printBoard(board);
        } while (true);
    }

    static void printBoard(String[] board){
        System.out.printf("%n %s | %s | %s %n", board[0], board[1], board[2]);
        System.out.println(" - + - + -");
        System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
        System.out.println(" - + - + -");
        System.out.printf(" %s | %s | %s %n%n", board[6], board[7], board[8]);

    }
}
