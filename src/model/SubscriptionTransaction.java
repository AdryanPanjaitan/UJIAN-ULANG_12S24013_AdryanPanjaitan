// Adryan Julianto Panjaitan - 12S24013

package model;

public class SubscriptionTransaction extends Transaction {

    public SubscriptionTransaction(String username, double amount, String description) {
        super(username, amount, description);
    }

    @Override
    protected void calculateFeeAndNet() {
        fee = 0.0;
        netAmount = amount;
    }

    @Override
    public void apply(Account account) {
        if (account.getUsername().equals(username) && account.getBalance() >= netAmount) {
            account.withdraw(netAmount);
        }
    }
}
