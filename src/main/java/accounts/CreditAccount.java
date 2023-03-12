package accounts;

import clients.MoneyTarget;

public class CreditAccount extends Account {

    public CreditAccount(String name, long balance) {
        super(name);
        this.balance = balance;
    }

    @Override
    public boolean pay(long amount) {
        return true;
    }

    @Override
    public boolean add(long amount) {
        if (balance <= 0) {
            balance += amount;
            if (balance >= 0) {
                balance = 0;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean setBalance(long amount) {
        if (amount > 0) {
            System.out.println("Кредитный баланс не может быть положительным");
            return false;
        } else {
            balance += amount;
            return true;
        }
    }
}
