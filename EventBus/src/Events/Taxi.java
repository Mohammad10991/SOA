package Events;

import Aircraft.Aircraft;
import Airport.Place;

public class Taxi {

    public static void taxi(Aircraft plane, Place destination, Place waypoint){
        plane.SetPosition(waypoint);
        plane.SetPosition(destination);
    }
}
