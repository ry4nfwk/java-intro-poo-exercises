package application;

import entities.VectRooms;

import java.util.Scanner;

public class fVectRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectRooms[] vect = new VectRooms[9];

        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.println();
            vect[i] = new VectRooms();
            System.out.println("Rent #"+ (i+1)+":");
            System.out.print("Name: ");
            sc.nextLine();
            String peopleName = sc.nextLine();
            vect[i].setPeopleName(peopleName);
            System.out.print("Email: ");
            String email = sc.nextLine();
            vect[i].setEmail(email);
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[i].setRoom(room);
        }
    }
}
