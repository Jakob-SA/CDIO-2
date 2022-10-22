package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Prints print = new Prints();
    public void gameStart() {
        String Player1TempName, Player2TempName, temp ="temp";
        int coin;
        print.player1Name();
        Player1TempName = input.nextLine();
        Player Player1 = new Player(Player1TempName);
        print.player2Name();
        Player2TempName = input.nextLine();
        Player Player2 = new Player(Player2TempName);
        coin = (int) Math.round(Math.random());

        while (temp != "") {
            print.randomStart();
            temp = input.nextLine();
        }
        if (coin == 0) {
            print.whoStarts(Player1.getName());
        } else {
            print.whoStarts(Player2.getName());
            Player1.setName(Player2TempName);
            Player2.setName(Player1TempName);
        }
    }
    public void game(Account acc) {
        int points = 0;
        String square = "temp";
        Account acc1 = new Account("Player1");
        DieCup cup = new DieCup(6);
        cup.roll();

        switch (cup.getSum()) {
            case 2:
                square = "Tower";
                points = 250;
                break;
            case 3:
                square = "Crater";
                points = -100;
                break;
            case 4:





        }

        acc1.addPoints(points);

    }

    }