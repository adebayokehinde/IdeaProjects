import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {
    @Test
    public void testThatgetAccountNumber() {
        Account account = new Account();
        account.getAccountNumber();
        assertEquals(null, account.getAccountNumber());
    }
    @Test
    public void testThatgetBalance() {
        Account account = new Account();
        account.getBalance();
        assertEquals(0.0, account.getBalance());
    }
    @Test
    public void testThatDeposite(){
        Account account = new Account();
        account.deposit(100);
        assertEquals(100.0, account.getBalance());
    }
    @Test
    public void testThatWithdraw(){
        Account account = new Account();
        account.withdraw(100);
        account.deposit(100);
        assertEquals(100.0, account.getBalance());
    }
    @Test
    public void testThatupdatepin() {
        Account account = new Account();
    }
}
