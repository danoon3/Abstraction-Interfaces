package accounts;

import clients.MoneyTarget;

public class CheckingAccount extends Account {
    private final long MIN_BALANCE = 0;

    public CheckingAccount(String name, long balance) {
        super(name);
        this.balance = balance;
    }

    @Override
    public boolean pay(long amount) {
        if (balance < MIN_BALANCE || amount > balance) {
            System.out.println("На счете недостаточно средств");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
