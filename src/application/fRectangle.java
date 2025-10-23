package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class fRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Rectangle r = new Rectangle();

        System.out.print("Enter rectangle width and height:");
        r.height = sc.nextDouble();
        r.width = sc.nextDouble();
        System.out.printf("AREA = %.2f\n", r.area());
        System.out.printf("PERIMETER = %.2f\n", r.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", r.diagonal());
    }
}
