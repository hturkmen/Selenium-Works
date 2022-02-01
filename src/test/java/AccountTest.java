import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;
    Account account = new Account(20);
    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
        account.getBalance()
    }
    @Test
    public void depositNotAcceptNegsative(){
        Assert.assertTrue(account.deposit(40));
        Assert.assertTrue(account.withdraw(account.getOverdraftLimit()+1));

    }
}