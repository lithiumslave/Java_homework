package lesson13HomeWork.CustomBankAccount;

import lesson5HomeWorkCombined.PrintOperations;

public class BankAccount {
    private int balance = 100;
    private final int maxLimit = 400;

    public void depositMoney(int sum) {
        balance += sum;
        System.out.println("You successfully deposited " + sum + " USD. " +
                           "\nCurrent balance is " + getBalance());
    }

    public void withdrawMoney(int sum) {
        try{
            if (sum > getBalance()){
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientFundsException("You don't have enough money on your account, available sum is: ", getBalance());
            } else if (sum >= getMaxLimit()) {
                System.out.println("You try to withdraw " + sum);
                throw new LimitExceededException("Impossible action! Your account has maximum limit of withdraw ", getMaxLimit());
            } else if (sum <= getBalance()) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                                   "\nCurrent balance is " + getBalance());
            }
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage() + e.getAmount());
            e.printStackTrace();
        } catch(LimitExceededException e) {
            System.out.println(e.getMessage() + e.getMaxLim());
            e.printStackTrace();
        }
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.depositMoney(100);
        bank.depositMoney(400);

        PrintOperations.printSeparator();

        bank.withdrawMoney(401);
        bank.withdrawMoney(150);
        bank.withdrawMoney(200);
        bank.withdrawMoney(300);

    }
}
