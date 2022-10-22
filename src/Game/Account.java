package Game;

public class Account {

    private String owner;
    private int balance;


    public Account (String owner) {
        balance = 0;


    }
    public int addPoints(int ammount)
    {
        balance = balance + ammount;
        return balance;

    }
    public int subtractPoints(Player owner){
        balance = balance - felt;
        return balance;


    }
}
