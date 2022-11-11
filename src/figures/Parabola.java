package figures;

public class Parabola {
    private double x0,y0, a;

    public Parabola(double x0, double y0, double a){
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointInsideOfParabola(double x, double y){
        return y >= a * Math.pow(x-x0, 2) + y0;
    }
}
