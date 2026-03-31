// Adryan Julianto Panjaitan - 12S24013 
package model;

public class WithdrawTransaction extends Transaction {

    public WithdrawTransaction(String username, double amount, String description) {
        super(username, amount, description);
    }

    @Override
    protected void calculateFeeAndNet() {
        fee = amount * 0.05;
        netAmount = amount + fee;
    }

    @Override
    public void apply(Account account) {
        if (account.getUsername().equals(username) && account.getBalance() >= netAmount) {
            account.withdraw(netAmount);
        }
    }
}