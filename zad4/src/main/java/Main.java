import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bank");
        Account account = new Account("4321", "Janusz Kowalski");

        System.out.println("Bank controller");
        Bank bank = new Bank("Santander", "1235");
    }
}
