package Airport.Field;

import Aircraft.Aircraft;
import Airport.Airport;

public interface IAircraftPosition {
     void setAircraft(Aircraft aircraft);
      Aircraft removeAircraft();
      String getName();
}
