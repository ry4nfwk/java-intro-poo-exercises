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
            System.out.println("Rent #"+ (i+1)+":");
            System.out.print("Name: ");
            sc.nextLine();
            String peopleName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new VectRooms();
            vect[room].setPeopleName(peopleName);
            vect[room].setEmail(email);
            vect[room].setRoom(room);
        }
        System.out.println("\nBusy rooms:");
            for (int i = 0; i < 9; i++){
                if(vect[i] != null){
                    System.out.println(i + ": " + vect[i]);
                }
            }
    }
}
