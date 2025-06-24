import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    // ✅ Setup method – runs before each test
    @BeforeEach
    void setUp() {
        account = new BankAccount("Harsh Kumar", 1000);
        System.out.println("Setting up fresh account instance...");
    }

    // ✅ Teardown method – runs after each test
    @AfterEach
    void tearDown() {
        account = null;
        System.out.println("Tearing down account instance...");
    }

    @Test
    void testDeposit() {
        // Arrange – already handled by setup

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // Arrange

        // Act
        account.withdraw(400);

        // Assert
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawThrowsException() {
        // Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);  // Withdraw more than balance
        });

        assertEquals("Insufficient funds or invalid amount", exception.getMessage());
    }

    @Test
    void testAccountHolderName() {
        // Arrange

        // Act
        String name = account.getAccountHolder();

        // Assert
        assertEquals("Harsh Kumar", name);
    }
}
