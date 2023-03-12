import accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {
    @Test
    public void creditAccountValidSetBalanceTest(){
        CreditAccount account = new CreditAccount("Test", 1000);
        final boolean expected = false;

        final boolean result = account.setBalance(Long.MAX_VALUE);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void creditAccountNonValidArgumentSetBalance(){
        CreditAccount account = new CreditAccount("Test", 0);
        final boolean expected = true;

        final boolean result = account.setBalance(Long.MIN_VALUE);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void creditPayValidArgument(){
        CreditAccount account = new CreditAccount("Test", -1000);
        final boolean expected = true;

        final boolean result = account.pay(800);

        Assertions.assertEquals(expected, result);
    }
}
