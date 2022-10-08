public class Wq2 {
    private double balance;
    public Wq2()
    {
        balance=0;
    }
    public Wq2(double initialBalance)
    {
        balance=initialBalance;
    }
public void deposit(double amount)
{
    balance=balance+amount;
}
     public void withdraw(double amount)
     {
         balance=balance-amount;
     }

}
