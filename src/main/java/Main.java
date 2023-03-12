import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Client customer = new Client(new Account[3]);

        customer.add(new CheckingAccount("Checking", 1000));
        customer.add(new SavingAccount("Saving", 1000, 2000));
        customer.add(new CreditAccount("Credit", -1000));
        customer.add(new CheckingAccount("Checking 2", 500));

        customer.pay(1500);

        CheckingAccount checkingAccount = new CheckingAccount("Denis", 1000);
        SavingAccount savingAccount = new SavingAccount("Irina", 500, 2000);

        checkingAccount.transfer(savingAccount, 500);

        savingAccount.getBalance();

        customer.accept(4000);
    }
}