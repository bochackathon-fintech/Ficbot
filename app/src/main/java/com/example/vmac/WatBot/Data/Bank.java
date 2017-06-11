package com.example.vmac.WatBot.Data;

import android.util.Log;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();

        accounts.add(new Account("Current", 10000));
        accounts.add(new Account("Savings", 100000));
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String transferMoneyToSavings(Long amount, boolean now){

        if (getCurrentAccount().getBalance() < amount){
            return "Naughty boy.. Your current account has less than " + amount;
        }

        if(now){
            getSavingsAccount().addMoney(amount);

            getCurrentAccount().removeMoney(amount);

            return "Transaction completed. You now have "+ getCurrentAccount().getBalance() + " in your Current Account and " + getSavingsAccount().getBalance() + " in your Savings Account.";
        }

        return "Transaction scheduled. ";
    }

    public String transferMoneyToCurrent(Long amount){

        // check if current has the specified amount
        if (getSavingsAccount().getBalance() < amount){
            return "Naughty boy.. Your current account has less than " + amount;
        }

        getCurrentAccount().addMoney(amount);

        getSavingsAccount().removeMoney(amount);

        return "Transaction completed. You now have "+ getCurrentAccount().getBalance() + " in your Current Account and " + getSavingsAccount().getBalance() + " in your Savings Account.";
    }

    public Account getCurrentAccount(){

        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getType() == "Current"){
                return accounts.get(i);
            }
        }
        return null;
    }

    public Account getSavingsAccount(){

        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getType() == "Savings"){
                return accounts.get(i);
            }
        }
        return null;    }
}
