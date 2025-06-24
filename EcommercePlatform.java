import java.util.*;

public class EcommercePlatform {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Base Price: ");
        double basePrice = scn.nextDouble();
        scn.nextLine();
        System.out.println("Membership Level: ");
        String membership = scn.nextLine();
        System.out.println("Purchase Time: ");
        String timeInput = scn.nextLine();
        int hour = Integer.parseInt(timeInput.substring(0, 2));
        System.out.println("Product Category: ");
        String category = scn.nextLine();
        System.out.println("Season: ");
        String season = scn.nextLine();
        double discount = 0;
        switch (membership) {
            case "Bronze":
                discount = 0.05;
                break;
            case "Silver":
                discount = 0.10;
                break;
            case "Gold":
                discount = 0.15;
                break;
            case "Platinum":
                discount = 0.20;
                break;
            default:
                System.out.println("Please enter an acceptable membership level.");
                return;
        }
        basePrice = basePrice - (basePrice * discount);
        if (hour >= 0 && hour < 6) {
            basePrice = basePrice - (basePrice * 0.10);
        } else if (hour >= 12 && hour < 14) {
            basePrice = basePrice - (basePrice * 0.05);
        }
        double newd = 0;
        switch (category) {
            case "Clothing":
                newd = 0.05;
                break;
            case "Groceries":
                newd = 0;
                break;
            case "Books":
                newd = 0.03;
                break;
        }
        basePrice = basePrice - (basePrice * newd);
        if (category.equals("Electronics")) {
            basePrice = basePrice + (basePrice * 0.02);
        } else if (category.equals("Furniture")) {
            basePrice = basePrice + (basePrice * 0.07);
        }
        if ((category.equals("Clothing") || category.equals("Furniture")) && season.equals("Spring")) {
            basePrice = basePrice - (basePrice * 0.05);
        }
        if (category.equals("Electronics") && season.equals("Winter")) {
            basePrice = basePrice - (basePrice * 0.10);
        }
        System.out.printf("Final price: %.2f TL\n", basePrice);

    }
}