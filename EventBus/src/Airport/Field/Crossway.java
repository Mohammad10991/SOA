package Airport.Field;

import Airport.ControlArea;
import Airport.Place;

public class Crossway extends CheckPoint {
    private CheckPoint start;
    private CheckPoint end;
    private CrosswayName name;


    public Crossway(CrosswayName name, ControlArea controlArea , CheckPoint start, CheckPoint end) {
        super(null,controlArea);
        this.start=start;
        this.end=end;

    }
    public CheckPoint getStart(){
        return start;
    }
    public CheckPoint getEnd(){
        return end;
    }
    @Override
    public Place getNames(){
      throw new RuntimeException("Cannot Check for this Crossway");
    }
    public CrosswayName getCrosswayName(){
        return name;
    }
    public String getNAmeString(){
        return name.toString();
    }
}
