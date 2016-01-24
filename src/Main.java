import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1:Solution of the quadratic equation");
        System.out.println("2:Finding a prime number");
        System.out.println("3:Finding NOD for 2 nums");
        System.out.println("Please select 1,2 or 3");

        Scanner scaner = new Scanner(System.in);
        int selection = scaner.nextInt();
        switch (selection) {
            case 1:
                QuadraticEquation.userInterface();
                QuadraticEquation.calculate();
                break;
            case 2:
                starPrimeCalc();
                starPrimeCalc();
                starPrimeCalc();


                break;
            case 3:
                Nod.enterNums();
                Nod.calculateNod();
        }

    }

    private static void starPrimeCalc() {
        new Thread(() -> {
            Primes p = new Primes();
            p.calc(10000);
            System.out.println(p.num);
        }).start();

    }
}
