package Aircraft;

public class Flap {
    public  final int id;
    private double degree;

    public Flap(int id) {
        this.id = id;
    }
    public void neutral(){degree = 0;}
    public void levelOne(){ degree = 20; }
    public  void leveltow(){ degree = 40;}
    public void levelthree(){ degree = 60; }
}
