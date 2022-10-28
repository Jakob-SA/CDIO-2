package Tests;

import Game.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Game.Account acc = new Account();
    @org.junit.jupiter.api.Test
    void canBalanceBeNegative() {
        acc.addPoints(-2000);
        assertEquals(0,acc.getBalance());
    }
}