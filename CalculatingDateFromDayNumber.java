import java.util.*;

public class CalculatingDateFromDayNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a day number between 1 to 365");
        int dayNumber = scn.nextInt();
        if (dayNumber <= 0 || dayNumber > 365) {
            System.out.println("Please enter a valid day.");
            return;
        }
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < days.length; i++) {
            if (dayNumber <= days[i]) {
                System.out.println("Date: " + dayNumber + "." + (i + 1));
                break;
            } else {
                dayNumber -= days[i];
            }
        }
    }
}
