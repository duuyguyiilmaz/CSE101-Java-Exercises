import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your annual income: ");
        double income = scn.nextDouble();

        if (income < 0) {
            System.out.println("Please enter a positive income");
            return;
        }
        double tax = 0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 70000) {
            tax = 2000 + (income - 30000) * 0.20;
        } else {
            tax = 10000 + (income - 70000) * 0.30;
        }
        scn.nextLine();
        System.out.println("Marial Status: ");
        String status = scn.nextLine();
        if (status.equals("Married")) {
            tax -= 1000;
        } else if (status.equals("Head of Household")) {
            tax -= 2000;
        }
        System.out.println("Calculated tax amount: " + tax);
    }
}
