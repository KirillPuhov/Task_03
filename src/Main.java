import colors.SimpleColor;
import figures.*;

import java.util.Scanner;

public class Main {
    private static final Parabola P1 = new Parabola(0,-6,1);
    private static final Rectangle R1 = new Rectangle(-6,5,4,-4);
    private static final Rectangle R2 = new Rectangle(1,9,8,0);

    public static void main(String[] args) {
        double x = input("Введите x: ");
        double y = input("Введите y: ");

        String color = getColor(x, y).name();
        System.out.printf("(%.4f, %.4f) -> %s", x, y, color);
    }

    public static double input(String text){
        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextDouble();
    }

    private static void tests(){
        System.out.println(getColor(2,4).name()); //g
        System.out.println(getColor(3,1).name()); //w
        System.out.println(getColor(-2,1).name()); //g
        System.out.println(getColor(2,8).name()); //g
        System.out.println(getColor(7,8).name()); //b
        System.out.println(getColor(3,-2).name()); //y
        System.out.println(getColor(-5,1).name()); //o
        System.out.println(getColor(0,-5).name()); //o
        System.out.println(getColor(-3,6).name()); //w
        System.out.println(getColor(-5,-6).name()); //g

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