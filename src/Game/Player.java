package Game;

public class Player {
    Account acc = new Account();
    private String name;


    public Player (String owner){
        name = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void points (int amount){
        acc.addPoints(amount);
    }
    public int getPoints () {
        return acc.getBalance();
    }

}
