import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testAccount {

    @Test
    public void testThatgetBalance() {
        Account account = new Account();
        account.getBalance();
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testThatDeposite() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testThatWithdraw() {
        Account account = new Account();
        account.withdraw(100);
        account.deposit(100);
        assertEquals(100.0, account.getBalance());
    }
}
