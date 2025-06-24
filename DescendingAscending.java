import java.util.*;

public class DescendingAscending {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello please enter a number with 3 digit.");
        int integer = scn.nextInt();
        if (integer < 100 || integer > 999) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }
        int yüzler = integer / 100;
        int onlar = (integer / 10) % 10;
        int birler = integer % 10;
        int sayılar[] = { yüzler, onlar, birler };
        System.out.println("Ascending: ");
        Arrays.sort(sayılar);
        for (int i = 0; i < sayılar.length; i++) {
            System.out.print(sayılar[i] + " ");
        }
        System.out.println();
        System.out.println("Descending: ");
        for (int i = sayılar.length - 1; i >= 0; i--) {
            System.out.print(sayılar[i] + " ");
        }
    }
}
