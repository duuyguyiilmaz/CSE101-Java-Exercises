import java.util.*;

public class InternetCafeBilling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter your spending minutes: ");
        int minutes = scn.nextInt();
        int hour = (minutes + 59) / 60;
        double charge = hour * 50;
        int unusedMinute = (hour * 60) - (minutes);
        System.out.println("Charge: " + charge + " Unused minutes: " + unusedMinute);

    }
}
