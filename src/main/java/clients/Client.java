package clients;

import accounts.*;

public class Client implements MoneyTarget {
    private Account[] accounts;

    public Client(Account[] accounts) {
        this.accounts = accounts;
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Для нового счета нет места :(");
    }

    public boolean pay(long amount) {
        System.out.println("Оплата покупки на сумму: " + amount + " рублей.");
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                break;
            }
            if (accounts[i].add(money)) {
                return true;
            }
        }
        System.out.println("Ни один из счетов нельзя пополнить");
        return false;
    }
}


