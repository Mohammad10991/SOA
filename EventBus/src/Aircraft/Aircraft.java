package Aircraft;

import Aircraft.Crew.Crew;
import Airport.Place;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Aircraft {
     private int id;
     private  String manufacturer;
     private AircraftName name;
    private Place currentPlace;
    public final int totalNumberOfSeats=568;
    public final int numberOfSeatFirstClass=80;
    public final int numberOfSeatsBusinessClass = 200;
    private int numberOfSeatsEconomyClass;
    private Wing[] wings=new Wing[2];
    private Gear[] gears = new Gear[5];
    private Crew crew = new Crew();
    private Seat[] seats = new Seat[totalNumberOfSeats];



    public Aircraft(AircraftName name,String manufacturer, int id , Place currentPlace ) {
          this.name=name;
          this.manufacturer=manufacturer;
        this.id=id;
        this.currentPlace=currentPlace;
        this.numberOfSeatsEconomyClass= totalNumberOfSeats - ( numberOfSeatFirstClass + numberOfSeatsBusinessClass);
    }
    public int getId(){
        return id;
    }
    public Place getCurrentPlace(){
        return currentPlace;
    }
    public AircraftName getName(){
        return name;
    }
    public void SetPosition(Place n){
        this.currentPlace = n;
    }

    public void writeEventLog(int plane, String event){
        try {
            FileWriter writer = new FileWriter("FlightLog.txt", true);
            String text = "#, " + plane + ", " + (System.currentTimeMillis() / 1000) + ", " + event;
            writer.write(text);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
