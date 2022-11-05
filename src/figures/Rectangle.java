package figures;
//для определения прямоугольника достаточно взять координаты двух точек образующих диагональ этого прямоугольника

public class Rectangle {
    private double ax;
    private double ay;
    private double dx;
    private double dy;

    public Rectangle(double ax, double ay, double dx, double dy){
        this.ax = ax;
        this.ay = ay;
        this.dx = dx;
        this.dy = dy;
    }

    public boolean isPointInsideRectangle(double x, double y){
        if(x >= ax && x <= dx){
            if(y <= ay && y >= dy){
                return true;
            }
        }
        return false;
    }


}
