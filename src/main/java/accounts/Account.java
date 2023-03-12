package accounts;

import clients.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected long balance;
    protected String name;

    public Account(String name) {
        this.name = name;
    }

    public abstract boolean pay(long amount);

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void getName() {
        System.out.println(name);
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public boolean accept(int amount) {
        return add(amount);
    }

    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }
}
