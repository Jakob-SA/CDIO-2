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
        System.out.println("It is " + name + "s tur. Press enter to shake the cup and roll!");
    }
    public void endTurn (int dieSum,String square, int gottenPoints, int totalPoints) {
        System.out.println("You rolled " + dieSum + " and landed on " + square + " and got " + gottenPoints + " points. In total you now have " + totalPoints + "!");
    }
}