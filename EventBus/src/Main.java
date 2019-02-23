import Aircraft.Aircraft;
import Aircraft.AircraftName;
import Airport.Airport;
import Airport.Place;
import Events.RunwayClearedForTakeOff;
import Events.RunwayClearedToLand;
import Events.HoldShort;
import Events.Taxi;


public class Main {

    public static void main(String[] args){


        //All the needed Aircrafts

        Aircraft F01 = new Aircraft(AircraftName.F01, "", 1, Place.A01);
        Aircraft F02 = new Aircraft(AircraftName.F02, "", 2, Place.A02);
        Aircraft F03 = new Aircraft(AircraftName.F03, "", 3, Place.A03);
        Aircraft F04 = new Aircraft(AircraftName.F04, "", 4, Place.A04);
        Aircraft F05 = new Aircraft(AircraftName.F05, "", 5, Place.A05);

        Aircraft F06 = new Aircraft(AircraftName.F06, "", 6, Place.B01);
        Aircraft F07 = new Aircraft(AircraftName.F07, "", 7, Place.B02);
        Aircraft F08 = new Aircraft(AircraftName.F08, "", 8, Place.B03);
        Aircraft F09 = new Aircraft(AircraftName.F09, "", 9, Place.B04);
        Aircraft F10 = new Aircraft(AircraftName.F10, "", 10, Place.B05);

        Aircraft F11 = new Aircraft(AircraftName.F11, "", 11, Place.inTheAir);
        Aircraft F12 = new Aircraft(AircraftName.F12, "", 12, Place.inTheAir);
        Aircraft F13 = new Aircraft(AircraftName.F13, "", 13, Place.inTheAir);
        Aircraft F14 = new Aircraft(AircraftName.F14, "", 14, Place.inTheAir);
        Aircraft F15 = new Aircraft(AircraftName.F15, "", 15, Place.inTheAir);

        Aircraft F16 = new Aircraft(AircraftName.F16, "", 16, Place.inTheAir);
        Aircraft F17 = new Aircraft(AircraftName.F17, "", 17, Place.inTheAir);
        Aircraft F18 = new Aircraft(AircraftName.F18, "", 18, Place.inTheAir);
        Aircraft F19 = new Aircraft(AircraftName.F19, "", 19, Place.inTheAir);
        Aircraft F20 = new Aircraft(AircraftName.F20, "", 20, Place.inTheAir);


        //direction of wind

        Place runwayLand_1 = Place.inTheAir;
        Place runwayLand_2 = Place.inTheAir;

        Place runwayStart_1 = Place.inTheAir;
        Place runwayStart_2 = Place.inTheAir;

        int random = (int)Math.random() * 4 +1;
        switch(random){
        case 1:
            runwayLand_1 = Place.R1_26R;
            runwayStart_1 = Place.R1_08L;
            runwayLand_2 = Place.R2_26L;
            runwayStart_2 = Place.R2_08R;
            break;
            case 2:
                runwayLand_1 = Place.R1_08L;
                runwayStart_1 = Place.R1_26R;
                runwayLand_2 = Place.R2_08R;
                runwayStart_2 = Place.R2_26L;
                break;
            case 3:
                runwayLand_1 = Place.R1_08L;
                runwayStart_1 = Place.R2_08R;
                runwayLand_2 = Place.R1_08L;
                runwayStart_2 = Place.R2_08R;
                break;
            case 4:
                runwayLand_1 = Place.R1_26R;
                runwayStart_1 = Place.R2_26L;
                runwayLand_2 = Place.R1_26R;
                runwayStart_2 = Place.R2_26L;
                break;
        }

        //f1 start
        //f11 land
        RunwayClearedToLand.runwayClearedToLand(F11, runwayLand_1);
        HoldShort.holdShort(F11, );
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f2 start
        //f12 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f3 start
        //f13 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f4 start
        //f14 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f5 start
        //f15 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f6 start
        //f16 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f7 start
        //f17 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f8 start
        //f18 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f9 start
        //f19 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();

        //f10 start
        //f20 land
        RunwayClearedToLand.runwayClearedToLand();
        HoldShort.holdShort();
        Taxi.taxi();
        HoldShort.holdShort();
        Taxi.taxi();
        RunwayClearedForTakeOff.runwayClearedForTakeOff();


    }
}
