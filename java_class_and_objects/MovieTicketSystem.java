// Program to Model a Movie Ticket Booking System

import java.util.Scanner;

class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket (assign seat and set price)
    void bookTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        seatNumber = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        price = sc.nextDouble();

        System.out.println("\nTicket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("\n--- Movie Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: ₹" + price);
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket();     // Book the ticket
        ticket.displayTicket();  // Display ticket details
    }
}
