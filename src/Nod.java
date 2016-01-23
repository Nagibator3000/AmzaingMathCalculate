import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nod {
    static int a;
    static int b;
    static List<Integer> aList = new ArrayList<>();
    List<Integer> bList = new ArrayList<>();

    public static void enterNums() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st num");
        a = scn.nextInt();
        calculateAList(a);
        System.out.println("Enter 2nd num");
        b = scn.nextInt();
    }

    public static void calculateAList(int x) {
        int i = 2;
        while (x > 1) {
            if (x % i == 0) {
                x = x / i;
                aList.add(i);
            }
            else {
                i++;
                x=x/i;
                aList.add(i);
            }
        }

    }
}

