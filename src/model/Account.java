// Adryan Julianto Panjaitan - 12S24013

package model;

import java.util.*;

public class Account{
    private String name;
    private String username;
    private double balance;
    private AccountType tipeakun;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String name, String username, AccountType type){
        this.name = name;
        this.username = username;
        this.balance = 0.0;
        this.tipeakun = type;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double netAmount){
        transactions.add(t);
        t.apply(this);
    }

    public String getName() { return name;}
    public String getUsername() { return username;}
    public double getBalance() {return balance;}
    public AccountType getTipeAkun() {return tipeakun;}
    public List<Transaction> getTransactions() {return new ArrayList<>(transactions);}

    @Override
    public String toString() {
return username + "|" + name + "|" + tipeAkun + "|" + String.format("%.1f", balance);
    }
}
