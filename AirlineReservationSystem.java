/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author abhiv
 */
import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean[] seats = new boolean[10];  // False indicates seat is available

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (!assignSeat(1, 5)) {
                    System.out.println("First class is full. Would you like to be placed in Economy? (yes/no)");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("yes")) {
                        if (!assignSeat(6, 10)) {
                            System.out.println("Economy is also full. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else if (choice == 2) {
                if (!assignSeat(6, 10)) {
                    System.out.println("Economy is full. Would you like to be placed in First Class? (yes/no)");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("yes")) {
                        if (!assignSeat(1, 5)) {
                            System.out.println("First Class is also full. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nCurrent seating arrangement:");
            printSeating();
        }
    }

    // Method to assign seat within the given range (start to end)
    private static boolean assignSeat(int start, int end) {
        for (int i = start - 1; i < end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("Boarding pass: Seat number " + (i + 1) + 
                                   (i < 5 ? " (First Class)" : " (Economy)"));
                return true;
            }
        }
        return false;  // No seats available in this section
    }

    // Method to print current seating arrangement
    private static void printSeating() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Taken" : "Available"));
        }
    }
}
