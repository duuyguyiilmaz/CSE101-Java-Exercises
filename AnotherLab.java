import java.util.*;

public class AnotherLab {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullNmae = scn.nextLine();
        String parts[] = fullNmae.split(" ");
        System.out.println(parts[1] + "," + parts[0]);
        System.out.println("Write a number between 1 to 7 ");
        int number = scn.nextInt();
        scn.nextLine();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
                break;
        }
        System.out.println("Enter three city names: ");
        String city1 = scn.nextLine();
        String city2 = scn.nextLine();
        String city3 = scn.nextLine();
        String arrayciities[] = { city1, city2, city3 };
        Arrays.sort(arrayciities);
        for (String city : arrayciities) {
            System.out.println(city);
        }
    }
}
