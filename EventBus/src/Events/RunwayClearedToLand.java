package Events;

import Aircraft.Aircraft;
import Airport.Place;

public class RunwayClearedToLand {

    public static void runwayClearedToLand (Aircraft plane, Place runway){

        plane.SetPosition(runway);

        plane.writeEventLog(plane.getId(), "ClearToLand");
    }
}
