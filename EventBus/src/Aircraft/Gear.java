package Aircraft;

public class Gear {
    public final GearType type;
    private boolean isDown = true;
    private boolean isBrakeSet = true;
    public final Wheel[] wheels;

    public Gear(GearType type) {
        this.type = type;
        if ( type == GearType.Fornt){
            wheels = new Wheel[6];
            for (int x = 0; x < 6 ;x++){
                wheels[x]=new Wheel(x,50);
            }
        }
        else {
            wheels = new Wheel[2];
            for (int x = 0; x <2 ;x++){
                wheels[x]=new Wheel(x,40);
            }
        }
    }

    public void up(){ isDown = false;}
    public void down(){ isDown = true;}
    public void setBrake(){ isBrakeSet=true;}
    public void releaseBrake(){ isBrakeSet = false;}
}
