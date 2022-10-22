package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    private String Player1TempName, Player2TempName, temp;
    private int coin;
    Prints print = new Prints();
    public void gameStart() {
        print.player1Name();
        Player1TempName = input.nextLine();
        print.player2Name();
        Player2TempName = input.nextLine();
        coin = (int) Math.round(Math.random());

        while (temp != "") {
            print.randomStart();
            temp = input.nextLine();
        }
        if (coin == 0) {
            Player Player2 = new Player(Player2TempName);
            Player Player1 = new Player(Player1TempName);
            print.whoStarts(Player1.getName());
        } else {
            Player Player1 = new Player(Player2TempName);
            Player Player2 = new Player(Player1TempName);
            print.whoStarts(Player2.getName());
        }

    }


}


