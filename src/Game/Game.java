package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    private String Player1Name, Player2Name, temp;
    private int coin;
    Prints print = new Prints();
    public void gameStart() {

        print.player1Name();
        Player Player1 = new Player(input.nextLine());
        print.player2Name();
        Player Player2 = new Player(input.nextLine());

        while (temp != "") {
            print.randomStart();
            temp = input.nextLine();
        }

        coin = (int) Math.round(Math.random());
        if (coin == 0) {
            print.whoStarts(Player1.getName());
        } else print.whoStarts(Player2.getName());

    }
}


