package application;
import entities.vectorProducts;

import java.util.Scanner;

public class fVector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double soma = 0;
        vectorProducts[] vect = new vectorProducts[N];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new vectorProducts(price, name);
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f", media);
    }
}
