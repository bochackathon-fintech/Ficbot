package com.example.vmac.WatBot.Data;

public class Account {

    private Long balance;
    private String type;

    public Account(String type, int balance) {
        this.type = type;
        this.balance = Long.valueOf(balance);
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void addMoney(Long money){
        this.balance += money;
    }

    public void removeMoney(Long money){
        this.balance -= money;
    }

    public String getType() {
        return type;
    }
}
