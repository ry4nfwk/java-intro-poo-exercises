package application;

import entities.bankAccount;

import java.util.Scanner;

public class fBankAccount {
    public static void main(String[] args) {
        int initialDeposit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        String yorn = sc.next();

        if (yorn.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            initialDeposit = sc.nextInt();
        }

        bankAccount bk = new bankAccount(accountNumber, accountHolder, initialDeposit);
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bk);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositRequest = sc.nextDouble();
        bk.deposit(depositRequest);
        depositRequest = 0;
        System.out.println("Updated account data:");
        System.out.println(bk);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawRequest = sc.nextDouble();
        bk.withdraw(withdrawRequest);
        withdrawRequest = 0;
        System.out.println("Updated account data:");
        System.out.println(bk);
    }
}
