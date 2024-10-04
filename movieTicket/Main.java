public class Main {
    public static void main(String[] args) {
        // Creating a ticket with just movie title and seat number (default price)
        MovieTicket ticket1 = new MovieTicket("Inception", "A12");
        System.out.println(ticket1);  // Output: Movie: Inception, Seat: A12, Price: $10.00

        // Creating a ticket with movie title, seat number, and custom price
        MovieTicket ticket2 = new MovieTicket("Avengers", "B7", 15.00);
        System.out.println(ticket2);  // Output: Movie: Avengers, Seat: B7, Price: $15.00

        // Applying a 10% discount
        ticket2.applyDiscount(10);
        System.out.println(ticket2);  // Output: Movie: Avengers, Seat: B7, Price: $13.50

        // Upgrading a regular ticket to premium
        ticket1.upgradeToPremium();
        System.out.println(ticket1);  // Output: Movie: Inception, Seat: A12, Price: $15.00

        // Creating a placeholder ticket (no details)
        MovieTicket ticket3 = new MovieTicket();
        System.out.println(ticket3);  // Output: Movie: Unknown, Seat: 0, Price: $0.00

        // Updating the placeholder ticket with final details
        ticket3.setMovieTitle("The Matrix");
        ticket3.setSeatNumber("C5");
        ticket3.setTicketPrice(12.00);
        System.out.println(ticket3);  // Output: Movie: The Matrix, Seat: C5, Price: $12.00
    }
}
