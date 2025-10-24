package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class fCurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double desiredQuantity = sc.nextDouble();
        double result = CurrencyConverter.amount(dollarPrice, desiredQuantity);
        System.out.printf("Amount to be paid in R$ %.2f",result);
    }
}
