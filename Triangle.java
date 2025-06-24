import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three positive integers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It is a triangle.");
            if (a == b && b == c) {
                System.out.println("Equilateral triangle (all sides equal).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles triangle (two sides equal).");
            } else {
                System.out.println("Scalene triangle (all sides different).");
            }
        } else {
            System.out.println("Invalid triangle: The sides do not satisfy the triangle inequality.");
        }

    }
}
