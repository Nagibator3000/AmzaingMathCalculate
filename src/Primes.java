import java.util.Scanner;

public class Primes {

    public static int n;

    public static void enterScreen() {
        System.out.println("Enter 'n' num");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        check(n);
        if (check(n) == true) {
            System.out.println("Prostoe");
        } else {
            System.out.println("Ne prostoe");
        }
    }

    public static boolean check(int num) {
        int x;
        if (num==1) return false;
        if ( num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                x = num % i;
                if (x == 0)
                    return false;
            }
        }
        return true;
    }
}