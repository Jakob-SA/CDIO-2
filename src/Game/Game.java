package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    private String Player1Name, Player2Name;

    public void gameStart() {
        Prints print = new Prints();
        print.player1Name();
        Player Player1 = new Player(input.nextLine());
        print.player2Name();
        Player Player2 = new Player(input.nextLine());
        print.randomStart();






    }

}


