package Game;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Prints print = new Prints();
    Player player1 = new Player("temp1");
    Player player2 = new Player("temp2");
    Account acc1 = new Account(player1);
    Account acc2 = new Account(player2);
    DieCup cup = new DieCup(6);
    public void gameStart() {
        String temp = "temp";
        int coin = (int) Math.round(Math.random());
        if (coin == 0) {
            print.player1Name();
            player1.setName(input.nextLine());
            print.player2Name();
            player2.setName(input.nextLine());
            while (temp != "") {
                print.randomStart();
                temp = input.nextLine();
            }
            print.whoStarts(player1.getName());
        } else {
            print.player1Name();
            player2.setName(input.nextLine());
            print.player2Name();
            player1.setName(input.nextLine());
            while (temp != "") {
                print.randomStart();
                temp = input.nextLine();
            }
            print.whoStarts(player1.getName());
        }
    }
    public void turn (Player x){
        int points = 0;
        String square = "temp";
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