package Aircraft;

public class Seat {
    public final int id;
     public final BookingClass bookingClass;

    public Seat(int id,BookingClass  bookingClass) {
        this.id = id;
        this.bookingClass=bookingClass;
    }
}
