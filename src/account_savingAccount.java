public class account_savingAccount extends account_account{
    //calculate 7.5% profit from balance of user. deduct 250rs from users account
    //when he withdraws money if his balance is less than 10000.
    public void calculateProfit(){
        double balance = getBalance();
        balance += balance * 0.075;
    }
    public void withdraw(double amount){
        double balance = getBalance();
        if (balance-amount<10000){
            balance -= 250;
        } else {
            balance -= amount;
        }
    }
}
