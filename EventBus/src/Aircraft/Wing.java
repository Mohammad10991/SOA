package Aircraft;

public class Wing {
    public final wingPosition wingPosition;
    private Fan[] fan=new Fan[2];
    private Flap[] flaps=new Flap[2];

    public Wing(wingPosition wingPosition) {
        this.wingPosition = wingPosition;
        for (int x=0; x<2;x++){
            fan[x]=new Fan(x,-1);
            flaps[x]=new Flap(x);
        }
    }
}
