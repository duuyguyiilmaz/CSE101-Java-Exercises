import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter a five digit number: ");
        int number = scn.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a five digit number!");
            return;
        }
        String stringnumber = String.valueOf(number);
        if (stringnumber.charAt(0) == stringnumber.charAt(4) && stringnumber.charAt(1) == stringnumber.charAt(3)) {
            System.out.println("It ıs a palindrome");
        } else {
            System.out.println("Please enter a palindrome");

        }
    }
}
