package Aircraft.Crew;

public class FlightAttendant extends Emplyee {
    private  boolean isPurser;

    public FlightAttendant(int id,boolean isPurser) {
        super(id);
        this.isPurser=isPurser;
    }
}
