package com.company;

public class BankAccount {

    private double ammount;
    private double sum;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public double deposit(double sum) {
        ammount = ammount + sum;
        System.out.println(" Your balance " + ammount);
        return ammount;
    }
    public double withDraw(double sum) throws LimitException {
        if (sum > ammount) {

            throw new LimitException (ammount, "Your balance is not enough. Your balance - ");
        }
        return ammount;
    }
}