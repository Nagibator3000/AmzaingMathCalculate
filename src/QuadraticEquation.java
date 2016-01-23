import java.util.Scanner;

public class QuadraticEquation {
    static int a = 1;
    static int b = -2;
    static int c = -3;
    static double x;
    static double x1;
    static double x2;
    static double discriminant;
    static double dicriminantSqrt;


    public static void calculate() {
        discriminant = Math.pow(b, 2) - (4 * a * c);
        System.out.println("D= " + discriminant);
        if (discriminant < 0) {
            System.out.println("Equation has no roots");
        } else {
            if (discriminant == 0) {
                x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                dicriminantSqrt = Math.sqrt(discriminant);
                x1 = (-b + dicriminantSqrt) / 2 * a;
                x2 = (-b - dicriminantSqrt) / 2 * a;
                System.out.println("x1 = " + x1 + " x2 = " + x2);

            }
        }
    }

    public static void userInterface() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a");
        a = in.nextInt();
        System.out.println("Enter b");
        b = in.nextInt();
        System.out.println("Enter c");
        c = in.nextInt();
        System.out.println("Equation: " + a + "x^2+" + b + "x+" + c + "=0");
    }
}

