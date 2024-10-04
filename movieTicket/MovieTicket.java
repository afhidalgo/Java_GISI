public class MovieTicket {
    private String movieTitle;
    private String seatNumber;
    private double ticketPrice;

    // Constructor 1: No information provided (use placeholders)
    public MovieTicket() {
        this.movieTitle = "Unknown";
        this.seatNumber = "0";
        this.ticketPrice = 0.0;
    }

    // Constructor 2: Movie title and seat provided (default price)
    public MovieTicket(String movieTitle, String seatNumber) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.ticketPrice = 10.00; // default price for regular screening
    }

    // Constructor 3: Movie title, seat, and custom price provided
    public MovieTicket(String movieTitle, String seatNumber, double ticketPrice) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    // Getters
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    // Setters
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // Apply a discount to the ticket price
    public void applyDiscount(double percentage) {
        this.ticketPrice -= this.ticketPrice * (percentage / 100);
    }

    // Upgrade the ticket to a premium screening
    public void upgradeToPremium() {
        this.ticketPrice += 5.00; // Adding $5.00 for premium screening
    }

    // Display the ticket information in a formatted string
    @Override
    public String toString() {
        return "Movie: " + movieTitle + ", Seat: " + seatNumber + ", Price: $" + String.format("%.2f", ticketPrice);
    }
}
