import java.util.*;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a meal ID (1-Doner, 2-Kebab, 3-Lahmacun):");
        int idMeal = scn.nextInt();

        System.out.println("Enter a drink ID (1-Ayran, 2-Kola, 3-Şalgam):");
        int idDrink = scn.nextInt();

        String meal = "";
        String drink = "";
        int price = 0;

        switch (idMeal) {
            case 1:
                meal = "Doner";
                price += 80;
                break;
            case 2:
                meal = "Kebab";
                price += 110;
                break;
            case 3:
                meal = "Lahmacun";
                price += 75;
                break;
            default:
                System.out.println("Invalid meal ID!");
                return;
        }

        switch (idDrink) {
            case 1:
                drink = "Ayran";
                price += 10;
                break;
            case 2:
                drink = "Kola";
                price += 20;
                break;
            case 3:
                drink = "Şalgam";
                price += 15;
                break;
            default:
                System.out.println("Invalid drink ID!");
                return;
        }

        System.out.println(meal + " and " + drink + ": " + price + " TL");
    }
}
