import Aircraft.Aircraft;
import Aircraft.AircraftName;
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
        HoldShort.holdShort(F11, Place.S1);
        Taxi.taxi(F01, runwayStart_1, Place.O5);
        HoldShort.holdShort(F01, Place.S4);
        Taxi.taxi(F11, Place.A01, Place.O1);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F01, runwayStart_1);

        //f2 start
        //f12 land
        RunwayClearedToLand.runwayClearedToLand(F12, runwayLand_1);
        HoldShort.holdShort(F12, Place.S1);
        Taxi.taxi(F02, runwayStart_1, Place.O5);
        HoldShort.holdShort(F02, Place.S4);
        Taxi.taxi(F12, Place.A02, Place.O2);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F02, runwayStart_1);

        //f3 start
        //f13 land
        RunwayClearedToLand.runwayClearedToLand(F13, runwayLand_1);
        HoldShort.holdShort(F13, Place.S1);
        Taxi.taxi(F03, runwayStart_1, Place.O5);
        HoldShort.holdShort(F03, Place.S4);
        Taxi.taxi(F13, Place.A03, Place.O3);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F03, runwayStart_1);

        //f4 start
        //f14 land
        RunwayClearedToLand.runwayClearedToLand(F14, runwayLand_1);
        HoldShort.holdShort(F14, Place.S1);
        Taxi.taxi(F04, runwayStart_1, Place.O5);
        HoldShort.holdShort(F04, Place.S4);
        Taxi.taxi(F14, Place.A04, Place.O4);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F04, runwayStart_1);

        //f5 start
        //f15 land
        RunwayClearedToLand.runwayClearedToLand(F15, runwayLand_1);
        HoldShort.holdShort(F15, Place.S1);
        Taxi.taxi(F05, runwayStart_1, Place.O5);
        HoldShort.holdShort(F05, Place.S4);
        Taxi.taxi(F15, Place.A05, Place.O5);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F05, runwayStart_1);

        //f6 start
        //f16 land
        RunwayClearedToLand.runwayClearedToLand(F16, runwayLand_2);
        HoldShort.holdShort(F16, Place.S2);
        Taxi.taxi(F06, runwayStart_2, Place.L5);
        HoldShort.holdShort(F06, Place.S3);
        Taxi.taxi(F16, Place.B01, Place.L1);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F06, runwayStart_2);

        //f7 start
        //f17 land
        RunwayClearedToLand.runwayClearedToLand(F17, runwayLand_2);
        HoldShort.holdShort(F17, Place.S2);
        Taxi.taxi(F07, runwayStart_2, Place.L5);
        HoldShort.holdShort(F07, Place.S3);
        Taxi.taxi(F17, Place.B02, Place.L2);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F07, runwayStart_2);


        //f8 start
        //f18 land
        RunwayClearedToLand.runwayClearedToLand(F18, runwayLand_2);
        HoldShort.holdShort(F18, Place.S2);
        Taxi.taxi(F08, runwayStart_2, Place.L5);
        HoldShort.holdShort(F08, Place.S3);
        Taxi.taxi(F18, Place.B03, Place.L3);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F08, runwayStart_2);


        //f9 start
        //f19 land
        RunwayClearedToLand.runwayClearedToLand(F19, runwayLand_2);
        HoldShort.holdShort(F19, Place.S2);
        Taxi.taxi(F09, runwayStart_2, Place.L5);
        HoldShort.holdShort(F09, Place.S3);
        Taxi.taxi(F19, Place.B04, Place.L4);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F09, runwayStart_2);


        //f10 start
        //f20 land
        RunwayClearedToLand.runwayClearedToLand(F20, runwayLand_2);
        HoldShort.holdShort(F20, Place.S2);
        Taxi.taxi(F10, runwayStart_2, Place.L5);
        HoldShort.holdShort(F10, Place.S3);
        Taxi.taxi(F20, Place.B05, Place.L5);
        RunwayClearedForTakeOff.runwayClearedForTakeOff(F10, runwayStart_2);



    }
}
