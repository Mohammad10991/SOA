package Aircraft.Crew;

public class Pilot extends Emplyee {
    private int flightExperienceInMiles;

    public Pilot(int id,int flightExperienceInMiles) {
        super(id);
        this.flightExperienceInMiles=flightExperienceInMiles;
    }
}
