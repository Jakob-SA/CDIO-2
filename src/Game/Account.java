package Game;

public class Account {
    private String owner;
    private int balance;
    public Account (String owner) {
        balance = 0;
    }
    public void addPoints(int ammount) {
        balance = balance + ammount;
    }
    public void subtractPoints(int felt) {
        balance = balance - felt;
    }
    public int getBalance() {
        return balance;
    }
}
