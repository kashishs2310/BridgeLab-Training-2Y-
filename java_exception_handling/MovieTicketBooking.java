import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String msg) { super(msg); }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) { super(msg); }
}

class MovieBooking {
    private Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for (int i = 1; i <= 5; i++) {
            seats.put(i, true);
        }
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat number " + seatNo + " does not exist.");
        if (!seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat " + seatNo + " is already booked!");
        seats.put(seatNo, false);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieBooking booking = new MovieBooking();
        try {
            booking.bookSeat(6);
        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
