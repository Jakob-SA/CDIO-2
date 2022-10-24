package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Prints print = new Prints();
    Player player1 = new Player("temp1");
    Player player2 = new Player("temp2");
    DieCup cup = new DieCup(6);
    Board board = new Board();
    public void gameStart() {

        int coin = (int) Math.round(Math.random());
        if (coin == 0) {
            print.player1Name();
            player1.setName(input.nextLine());
            print.player2Name();
            player2.setName(input.nextLine());
            print.randomStart();
            pressEnter();
            print.whoStarts(player1.getName());
        } else {
            print.player1Name();
            player2.setName(input.nextLine());
            print.player2Name();
            player1.setName(input.nextLine());
            print.randomStart();
            pressEnter();
            print.whoStarts(player1.getName());
        }
    }

    public void player1Turn () {
        print.whoTurn(player1.getName());
        pressEnter();
        cup.roll();
        player1.points(board.getValue(cup.getSum()));
        print.endTurn(cup.getSum(), board.getSquare(cup.getSum()), board.getValue(cup.getSum()), player1.getPoints());
    }
    public void player2Turn () {
        print.whoTurn(player2.getName());
        pressEnter();
        cup.roll();
        player2.points(board.getValue(cup.getSum()));
        print.endTurn(cup.getSum(), board.getSquare(cup.getSum()), board.getValue(cup.getSum()), player2.getPoints());
    }
    public int getPlayer1Points () {
        return player1.getPoints();
    }
    public int getPlayer2Points () {
        return player2.getPoints();
    }
    public void chooseWinner () {
        if  (player1.acc.getBalance()> player2.acc.getBalance())
        print.endGame(player1.getName());
        else print.endGame(player2.getName());
    }
        private void pressEnter () {
            String temp = "temp";
            while (temp != "") {
                temp = input.nextLine();
            }
        }
    }

