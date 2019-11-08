package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        while (true) {

            bankAccount.setAmmount(bankAccount.getAmmount() - bankAccount.getSum());

            try {
                bankAccount.withDraw(6000);


            } catch (LimitException le) {

                System.out.println(" Your balance  - " + bankAccount.getAmmount());
                if (bankAccount.getSum() > bankAccount.getAmmount()) {

                    bankAccount.setAmmount(bankAccount.getAmmount() - bankAccount.getSum());
                }
            }


        }

    }
}


