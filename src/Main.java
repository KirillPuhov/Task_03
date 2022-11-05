import colors.SimpleColor;
import figures.*;

import java.util.Scanner;

public class Main {
    private static final Parabola P1 = new Parabola(1,0,-6);
    private static final Rectangle R1 = new Rectangle(-6,5,4,-4);
    private static final Rectangle R2 = new Rectangle(1,9,8,0);

    public static void main(String[] args) {
        double x = input("Введите x: ");
        double y = input("Введите y: ");

        String color = getColor(x, y).name();
        System.out.printf("(%.4f, %.4f) -> %s", x, y, color);
    }

    public static double input(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextDouble();
    }

    private static SimpleColor getColor(double x, double y){
        if(R1.isPointInsideRectangle(x, y) && R2.isPointInsideRectangle(x, y) && P1.isPointInsideOfParabola(x, y)){
            return SimpleColor.GRAY;
        }

        if(R1.isPointInsideRectangle(x, y) && R2.isPointInsideRectangle(x, y)){
            return SimpleColor.WHITE;
        }

        if(P1.isPointInsideOfParabola(x, y) && R1.isPointInsideRectangle(x, y)){
            return SimpleColor.GRAY;
        }

        if(P1.isPointInsideOfParabola(x, y) && R2.isPointInsideRectangle(x, y)){
            return SimpleColor.GRAY;
        }

        if(R1.isPointInsideRectangle(x, y)){
            if(x < 0){
                return SimpleColor.ORANGE;
            }
            return SimpleColor.YELLOW;
        }

        if(R2.isPointInsideRectangle(x, y)){
            return SimpleColor.BLUE;
        }

        if(P1.isPointInsideOfParabola(x, y)){
            if(y < 0){
                return SimpleColor.ORANGE;
            }
            return SimpleColor.WHITE;
        }

        return SimpleColor.GRAY;
    }
}