package anderson;

import java.util.Scanner;

public class Circle {

    private static final Scanner input = new Scanner(System.in);

    private double Radius() {
        System.out.println("Enter the radius");
        double r = input.nextDouble();
        return r;
    }

    private double Area(double r){
        double a = (3.14 * r * r);
        return a;
    }

    private double Circumference(double r){
        double c = (3.14 * r * 2);
        return c;
    }

    private void Answer(double a, double c){
        System.out.print("The Area is ");
        System.out.println(a);
        System.out.print("The Circumference is ");
        System.out.println(c);
    }


    public static void main(String[] args) {
        Circle x = new Circle();
        double r = x.Radius();
        double a = x.Area(r);
        double c = x.Circumference(r);
        x.Answer(a, c);
    }
}

