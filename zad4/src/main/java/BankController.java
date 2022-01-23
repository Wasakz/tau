import java.util.ArrayList;
import java.util.List;

public class BankController {

    private List<Bank> bankList = new ArrayList<>();

    public void addBank (Bank bank) {
        this.bankList.add(bank);
    }

    public List<Bank> getBankList() {
        return this.bankList;
    }

    public BankController(List<Bank> bankList) {
        this.bankList = new ArrayList<>();
    }
}
