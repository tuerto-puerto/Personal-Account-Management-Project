import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonalAccountTest {
    private PersonalAccount account;

    @Before
    public void setUp() {
        account = new PersonalAccount(220104008, "Kesha");
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() throws InsufficientBalanceException{
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() throws InsufficientBalanceException{
        account.deposit(50.0);
        account.withdraw(100.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals(220104008, account.getAccountNumber());
    }

    @Test
    public void testGetAccountHolder() {
        assertEquals("Kesha", account.getAccountHolder());
    }
}
