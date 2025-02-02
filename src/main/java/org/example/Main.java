package org.example;

import org.example.Classes.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Jane");
        account.depositMoney(3000);
    }
}