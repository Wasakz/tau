package com.company;

public class Account {

    private int id;
    private String number;
    private String ownerName;
    private double balance;
    private boolean isActive;

    public Account(String number, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
        this.balance = 0;
        this.isActive = false;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }



    public boolean activate() {
        if (!this.isActive()) {
            this.isActive = true;
            return true;
        } else {
            System.out.println("Account already activate");
            return false;
        }
    }

    public boolean deactivate() {
        if(this.isActive) {
            this.isActive = false;
            return true;
        } else{
            System.out.println("Account already not active");
            return false;
        }
    }

    public boolean deposit (double money) {
        double currentMoney = this.getBalance();
        this.balance = currentMoney + money;
        return true;
    }

    public boolean withdraw (double money) {
        double currentMoney = this.getBalance();
        if (money > currentMoney) {
            System.out.println("You don't have that much money!");
            return false;
        }
        else {
            this.balance = currentMoney - money;
            return true;
        }
    }
    public double calculateInterestSimple(double money, double percent, int numberOfMonths) {
        double t = numberOfMonths/12;
        return money + money*(percent/100)*t;
    }

    public double calculateInterestCapitalization(double money, double percent, int numberOfMonths, int capitalizationMonths)
    {
        int n = numberOfMonths/capitalizationMonths;
        return money * Math.pow((1+percent/100), n);
    }

}
