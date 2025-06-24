import java.util.*;

public class   Function {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a real number x: ");
        double x = scn.nextDouble();

        if (x <= 0) {
            System.out.println("f(" + x + ")=" + (x * x));
        } else if (x > 0 && x < 10) {
            System.out.println("f(" + x + ")=" + ((2 * x) + 1));
        } else if (x >= 10) {
            System.out.println("f(" + x + ")=" + (x * x * x - x));
        }
    }
}
