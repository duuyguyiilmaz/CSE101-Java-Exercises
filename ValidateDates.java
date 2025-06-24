import java.util.*;

public class ValidateDates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a day : ");
        int day = scn.nextInt();
        System.out.print("Enter a month : ");
        int month = scn.nextInt();
        System.out.print("Enter a year : ");
        int year = scn.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Please enter a valid date.It must be between 1 and 12");
            return;
        }
        int maxDyas;
        switch (month) {
            case 4, 6, 9, 11:
                maxDyas = 30;
                break;
            case 2:
                if (IsLeapYear(year)) {
                    maxDyas = 29;
                } else {
                    maxDyas = 28;
                }
                break;
            default:
                maxDyas = 31;
                break;
        }
        if (day < 1 || day > maxDyas) {
            System.out.println("Please enter a validate day");
        } else {
            System.out.println("You entered a validate date");
        }
    }

    public static boolean IsLeapYear(int year) {
        return (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);
    }
}
