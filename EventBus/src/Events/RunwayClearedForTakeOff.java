package Events;

import Aircraft.Aircraft;
import Airport.Place;

public class RunwayClearedForTakeOff {

    public static void runwayClearedForTakeOff (Aircraft plane, Place runway){

        plane.SetPosition(runway);

        plane.writeEventLog(plane.getId(), "ClearForTakeOff");
    }
}
