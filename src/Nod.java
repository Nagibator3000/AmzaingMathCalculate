import java.util.Scanner;

public class Nod {
    static int a;
    static int b;


    public static void enterNums() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st num");
        a = scn.nextInt();
        System.out.println("Enter 2nd num");
        b = scn.nextInt();
    }

    public static void calculateNod() {

        while (a!=b){
            if (a<b){
                a = a + b;
                b = a - b;
                a = a - b;

            }
            a=a-b;
            if (a==b){
                System.out.println("Nod= "+a);
            }
        }


    }
}

