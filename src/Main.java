import Game.Game;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.gameStart();
        while (game.getPlayer1Points() < 3000 && game.getPlayer2Points() < 3000) {
            game.player1Turn();
            game.player2Turn();
        }
        game.chooseWinner();
        }
    }

