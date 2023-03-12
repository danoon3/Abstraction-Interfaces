package accounts;

import clients.MoneyTarget;

public class SavingAccount extends Account {
    protected long minBalance;

    public SavingAccount(String name, long minBalance, long balance) {
        super(name);
        this.minBalance = minBalance;
        this.balance = balance;
    }

    @Override
    public boolean pay(long amount) {
        if (balance < minBalance || amount > balance) {
            System.out.println("На счете недостаточно средств, пополните счет еще на " + (minBalance - balance) + " рублей.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Вы заплатили: " + amount + " , баланс: " + balance);
            return true;
        }
    }
}
