package figures;
//парабола y = ax^2 + bx + c
public class Parabola {
    private double a,b,c;

    public Parabola(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calculateDiscriminant(){
        double result = Math.pow(b, 2) - 4*a*c;
        return result;
    }

    private double calculateValue(double x0){
        double result = a*Math.pow(x0, 2) + b*x0 + c;
        return result;
    }

    public boolean isPointInsideOfParabola(double x, double y){

        if(a > 0){
            if(calculateDiscriminant() > 0 && calculateValue(x) < 0){
                if(calculateValue(x) <= y){
                    return true;
                }
            }

            if (calculateDiscriminant() == 0 && calculateValue(x) >= 0) {
                if(calculateValue(x) <= y){
                    return true;
                }
            }

            if(calculateDiscriminant() < 0 && calculateValue(x) > 0){
                if(calculateValue(x) <= y){
                    return true;
                }
            }

            return false;
        }else{
            if(calculateDiscriminant() > 0 && calculateValue(x) > 0){
                if(calculateValue(x) >= y){
                    return true;
                }
            }

            if(calculateDiscriminant() == 0 && calculateValue(x) <= 0){
                if(calculateValue(x) >= y){
                    return true;
                }
            }

            if(calculateDiscriminant() < 0 && calculateValue(x) < 0){
                if(calculateValue(x) >= y){
                    return true;
                }
            }

            return false;
        }
    }
}
