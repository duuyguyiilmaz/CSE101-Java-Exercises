import java.util.*;

public class RGBValues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Red (R): 0 to 255\r\n" +
                " Green (G): 0 to 255\r\n" +
                " Blue (B): 0 to 255");
        System.out.println("RED(R): ");
        int R = scn.nextInt();
        System.out.println("GREEN(G): ");
        int G = scn.nextInt();
        System.out.println("BLUE(B): ");
        int B = scn.nextInt();
        if (R < 0 || R > 255 || G < 0 || G > 255 || B < 0 || B > 255) {
            System.out.println("Error: Each value must be between 0 and 255.");
            return;
        }

        if (R > G && R > B) {
            System.out.println("The dominat color is: RED");
        } else if (G > R && G > B) {
            System.out.println("The dominant color is: GREEN");
        } else if (B > R && B > G) {
            System.out.println("The dominant color is: BLUE");
        } else if (G == R && R == B) {
            System.out.println("Colors are equal in intensity.");
        } else if ((G == R && R > B) || (G == B && B > R) || (B == R && R > G)) {
            System.out.println("No dominant color, two or more colorsare equal and highest.");
        }
    }

}
