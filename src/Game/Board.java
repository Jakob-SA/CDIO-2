package Game;

public class Board {

    static String Squares[] = {null,null,"Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery","Black cave", "Huts in the mountain", "Werewolf-wall", "Pit", "Goldmine"};
    static int Values[] = {0,0,250,-100,100,-20,180,0,-70,60,-80,-50,650};

    public String getSquare (int dieSum) {
        return Squares[dieSum];
    }

    public int getValue (int dieSum) {
        return Values[dieSum];
    }
}
