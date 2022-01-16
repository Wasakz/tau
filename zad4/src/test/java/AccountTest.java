import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account testAccount = new Account("1234", "Piotr Wasak");
    @org.junit.jupiter.api.Test
    void activate() {
        testAccount.activate();
     //   assertEquals(true, testAccount.isActive());
        assertTrue(testAccount.isActive());
    }


    @org.junit.jupiter.api.Test
    void deactivate() {
        testAccount.deactivate();
       // assertEquals(false, testAccount.isActive());
        assertFalse(testAccount.isActive());
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        testAccount.deposit(1500);
        assertEquals(1500, testAccount.getBalance());
        testAccount.deposit(1000);
        assertEquals(2500, testAccount.getBalance());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        testAccount.deposit(2000);
        testAccount.withdraw(500);
        assertEquals(1500, testAccount.getBalance());
    }

    @Test
    void getNumber() {
        assertEquals("1234", testAccount.getNumber());
    }

    @Test
    void getOwnerName() {
        assertEquals("Piotr Wasak", testAccount.getOwnerName());
    }

    @Test
    void getBalance() {
        assertEquals(0, testAccount.getBalance());
    }

    @Test
    void calculateInterestSimple() {
        assertEquals(5250, testAccount.calculateInterestSimple(5000, 5, 12));
    }

    @Test
    void calculateInterestCapitalization() {
        assertEquals(5788.13, testAccount.calculateInterestCapitalization(5000, 5, 36, 12), 0.01);
    }

    @Test
    void calculateExchangeRate(){
        assertEquals(1000, testAccount.calculateExchangeRate(2000, 0.5));
    }
}