import java.util.*;

public class SumorProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number with a 4 digit.");
        int number = scn.nextInt();
        if (number < 1000 || number > 9999) {
            System.out.println("Try again.Please enter a number with a 4 digit.");
            return;
        }
        int fourth = number / 1000;
        int third = (number % 1000) / 100;
        int second = (number % 100) / 10;
        int first = number % 10;
        int sum = fourth + third + second + first;
        int product = fourth * third * second * first;
        System.out.println("Sum of the digit: " + sum);
        System.out.println("Product of the digit: " + product);
        if (product > sum) {
            System.out.println("Product is grater than sum");
        } else {
            System.out.println("Sum is grater than Product");

        }
    }
}
