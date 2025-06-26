import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000);
        System.out.println("Setup: New BankAccount initialized with ₹1000");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Test completed.\n");
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        Assert.assertEquals("Balance should be 1500 after deposit", 1500, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        boolean result = account.withdraw(400);
        Assert.assertTrue("Withdrawal should be successful", result);
        Assert.assertEquals("Balance should be 600 after withdrawal", 600, account.getBalance());
    }

    @Test
    public void testWithdrawFailure() {
        boolean result = account.withdraw(2000);
        Assert.assertFalse("Withdrawal should fail", result);
        Assert.assertEquals("Balance should remain 1000", 1000, account.getBalance());
    }
}
