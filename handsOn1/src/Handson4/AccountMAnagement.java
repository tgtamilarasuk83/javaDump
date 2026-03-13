package Handson4;

/*
 * Author  : Tamilarasu K
 * Program : Account Management
 * Description : Implements basic bank account operations like credit, debit, and transfer
 */


import java.util.*;

public class AccountMAnagement {
    String accId;
    String accName;
    int balance = 0;

    public AccountMAnagement(String accId, String accName) {
        this.accId = accId;
        this.accName = accName;
    }

    public int credit(int amt) {
        balance += amt;
        return balance;
    }

    public int debit(int amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transfer(AccountMAnagement receiver, int amt) {
        if (amt <= balance) {
            balance -= amt;
            receiver.balance += amt;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    void display() {
        System.out.println("\nAccount Details");
        System.out.println("ID      : " + accId);
        System.out.println("Name    : " + accName);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        AccountMAnagement a1 = new AccountMAnagement("A12", "Tamil");
        AccountMAnagement a2 = new AccountMAnagement("A22", "Soundar");

        a1.credit(5000);
        a1.debit(2000);
        a1.transfer(a2, 2000);

        a1.display();
        a2.display();
    }
}