package application;

import entities.Student;

import java.util.Scanner;

public class fStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.firstTrimester = sc.nextInt();
        s.secondTrimester = sc.nextInt();
        s.thirdTrimester = sc.nextInt();
        System.out.println("FINAL GRADE = "+ s.finalGrade());
        if (s.finalGrade() > 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - s.finalGrade()) + "POINTS");
        }
    }
}
