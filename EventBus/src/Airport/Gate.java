package Airport;

import Aircraft.Aircraft;
import Airport.Field.IAircraftPosition;

public class Gate implements IAircraftPosition {
    private boolean isOpen;
    private  Aircraft aircraft;
    private GateName name;
    public Gate( GateName name ) {
        this.name=name;
    }
    private boolean isOpen(){
        return isOpen;
    }
    private Aircraft getAircraft(){
        return aircraft;
    }
    private GateName getNAme(){
        return name;
    }

    @Override
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public Aircraft removeAircraft() {
        Aircraft a = aircraft;
        aircraft=null;
        return a;
    }

    @Override
    public String getName() {
        return name.toString();
    }
}
