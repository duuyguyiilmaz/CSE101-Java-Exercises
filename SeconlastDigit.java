import java.util.*;

public class SeconlastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a integer");
        int number = scn.nextInt();
        if (number >= 0 && number < 10) {
            System.out.println("0");
        } else {
            String numberString = "" + number;
            System.out.println(numberString.charAt(numberString.length() - 2));
        }

    }
}
