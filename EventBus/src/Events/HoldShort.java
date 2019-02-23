package Events;

import Aircraft.Aircraft;
import Airport.Place;

public class HoldShort {

    public static void holdShort(Aircraft plane, Place position){

        plane.SetPosition(position);

        plane.writeEventLog(plane.getId(), "HoldShort");
    }
}
