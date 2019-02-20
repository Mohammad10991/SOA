package Airport.Field;

import Aircraft.Aircraft;
import Airport.ControlArea;
import Airport.Place;

public class CheckPoint implements IAircraftPosition {
    public final int idAuto = 0;
    public Aircraft current;
    private int id;
    private Place name;
    private ControlArea controlArea;


    public CheckPoint(Place name, ControlArea controlArea) {
        this.name = name;
        this.controlArea = controlArea;
        this.id = idAuto;
    }

    public int getId() {
        return id;
    }

    public Place getNames() {
        return name;
    }

    public ControlArea getControlArea() {
        return controlArea;
    }


    @Override
    public void setAircraft(Aircraft aircraft) {
        aircraft = aircraft;
    }

    @Override
    public Aircraft removeAircraft() {
    Aircraft a = current;
    current = null;
    return a;

   }
    @Override
    public String getName() {
        return name.toString();
    }
}
