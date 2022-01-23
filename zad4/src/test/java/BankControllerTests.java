import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

public class BankControllerTests {

    private List<Bank> mockData() {
        List<Bank> bankList = new ArrayList<>();
        bankList.add(new Bank("Santander", "1245"));
        bankList.add(new Bank("mBank", "54321"));
        return bankList;
    }


    @Test
    public void getBankList() {
        BankController bankController = mock(BankController.class);

        when(bankController.getBankList()).thenReturn(mockData());

        List<Bank> bankList = bankController.getBankList();

        assertThat(bankList, Matchers.hasSize(2));
    }

    @Test
    void addBank() {
        BankController bankController = mock(BankController.class);
        given(bankController.addBank(Mockito.any(Bank.class))).willReturn(new Bank("ING", "542"));
        Bank bank = bankController.addBank(new Bank());
        assertEquals(bank.getName(), "ING");
        assertEquals(bank.getIBAN(), "542");
    }
}
