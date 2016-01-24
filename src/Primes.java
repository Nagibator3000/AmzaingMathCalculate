import java.util.Scanner;

public class Primes {

    public int n;
    public int primesNumCount = 0;
    public int num;

    public  void enterScreen() {
        System.out.println("Enter 'n' num");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        calc();
    }

    private void calc() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (primesNumCount!=n) {
            i++;
            if (check(i)) {
                primesNumCount++;

            }

        }
        System.out.println("prime num= "+i);
        System.out.println("Calculation time= "+(System.currentTimeMillis()-startTime)+" ms");
    }

    public boolean check(int num) {
        int x;
        if (num == 0) return false;
        if (num == 1) return false;
        if (num == 2) {
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

    public void calc(int i) {
        n=i;
        calc();
    }
}