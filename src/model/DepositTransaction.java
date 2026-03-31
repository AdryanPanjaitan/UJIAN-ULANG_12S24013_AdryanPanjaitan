// Adryan Julianto Panjaitan - 12S24013

package model;

public class DepositTransaction extends Transaction {

    public DepositTransaction(String username, double amount, String description) {
        super(username, amount, description);
    }

    @Override
    protected void calculateFeeAndNet() {
        fee = 0.0;
        netAmount = amount;
    }

    @Override
    public void apply(Account account) {
        if (account.getUsername().equals(username)) {
            account.deposit(netAmount);
        }
    }
}
