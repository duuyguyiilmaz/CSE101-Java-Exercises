import java.util.*;

public class Exercises {
    public static void main(String args[]) {
        System.out.println("5! = " + factorial(5));
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.print("First 5 prime numbers: ");
        nPrimes(5);

    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial2(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial2(number - 1);
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        int primecount = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                primecount++;
            }
        }
        if (primecount == 0) {
            return true;
        }
        return false;
    }

    public static void nPrimes(int number2) {
        int count = 0;
        int num = 2;
        while (count < number2) {
            if (isPrime(num)) {
                System.out.print(num + ",");
                count++;
            }
            num++;
        }
    }

    public static boolean perfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    public static void nPerfectNumber(int number) {
        int count = 0;
        int num = 1;
        while (count < number) {
            if (perfectNumber(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
    }

    public static void displayStatistic(int n) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int originalN = n;
        System.out.println("Enter a " + n + " numbers:");
        while (n > 0) {
            int number = scn.nextInt();
            sum += number;
            n--;
        }
        double mean = (double) sum / originalN;
        System.out.println("Mean: " + mean);

    }
}
