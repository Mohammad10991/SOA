package Aircraft;

public class Fan {
    public final int id;
    private int rpm;
    private Blade[] blades=new Blade[96];


    public Fan(int id,int rpm) {
        this.id=id;
        this.rpm=rpm;

        for (int x=0;x<96;x++){
            if(id<1) blades[x]=new Blade(x,Material.Carbon);
            else blades[x]=new Blade(x,Material.Titan);
        }
    }
    public void start(){if(rpm <0 ) rpm = 0;}
    public void shutdown(){rpm = -1;}
    public void increaseRPM(int value){
        if(rpm >= 0) rpm += value;
    }
    public void decreaseRPM(int value){
        if( rpm >= 0){
            rpm -= value;
            if(rpm < 0) rpm = 0;
        }
    }
}
