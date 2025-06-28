import java.util.*;

public class DiceProbability {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number k trial:");
        int k = scn.nextInt();
        double DiceProbibility = Math.pow(((5.0 / 6)), (k - 1)) * (1.0 / 6);
        System.out.printf("The probability of rolling the first 4 on trial <%d> is: %.6f\n", k, DiceProbibility);

    }
}
