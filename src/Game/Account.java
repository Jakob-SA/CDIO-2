package Game;

public class Account {
    private int balance;
    public Account () {
        balance = 1000;
    }
    public void addPoints(int ammount) {
        balance = balance + ammount;
        if (balance < 0)
            balance = 0;
    }
    public int getBalance() {
        return balance;
    }
}
