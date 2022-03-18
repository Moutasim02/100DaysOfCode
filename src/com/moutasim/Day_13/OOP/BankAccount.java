package com.moutasim.Day_13.OOP;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amountToDeposit) {
        System.out.print("\nYour updated balance after successful deposit is: " );
        System.out.print(balance += amountToDeposit);
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            System.out.print("\nCan't withdraw as you don't have sufficient funds");
        } else {
            System.out.print("\nYour updated balance after successful withdrawal is: ");
            System.out.print(balance += amountToWithdraw);
        }
    }

    public String toString() {
        return    "\nAccount number: " + accountNumber
                + "\nBalance: " + balance
                + "\nName: " + customerName
                + "\nEmail: " + email
                + "\nPhone: " + phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
