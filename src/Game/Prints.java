package Game;

public class Prints {
    public void player1Name(){
        System.out.println("Player 1! Write your name");
    }
    public void player2Name(){
        System.out.println("Player 2! Write your name");
    }
    public void randomStart() { System.out.println("Press enter to randomly choose who starts"); }
    public void whoStarts(String name){
        System.out.println(name + " starts!");
    }
    public void whoTurn (String name) {
        System.out.println("It is " + name + "s turn. Press enter to shake the cup and roll!");
    }
    public void endTurn (int dieSum,String square, int gottenPoints, int totalPoints) {
        if (dieSum == 10) {
            System.out.println("You rolled " + dieSum + ", landed on The " + square + " and got " + gottenPoints + " points. In total you now have " + totalPoints + "!\nYou get an extra turn!" );
        } else
        System.out.println("You rolled " + dieSum + ", landed on The " + square + " and got " + gottenPoints + " points. In total you now have " + totalPoints + "!");
    }
    public void endGame (String name) {
        System.out.println("Cangratulations " + name + "! You have won the game.");
    }
}