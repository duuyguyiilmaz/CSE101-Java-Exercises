import java.util.*;

public class InserectionCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter circle1 x");
        int circle1x = scn.nextInt();
        System.out.println("Enter circle1 y");
        int circle1y = scn.nextInt();
        System.out.println("Enter circle1 radius");
        int radius = scn.nextInt();
        System.out.println("Enter circle2 x");
        int circle2x = scn.nextInt();
        System.out.println("Enter circle2 y");
        int circle2y = scn.nextInt();
        System.out.println("Enter circle2 radius");
        int radius2 = scn.nextInt();
        double distance = Math.sqrt(Math.pow(circle1x - circle2x, 2) + Math.pow(circle1y - circle2y, 2));
        if (distance > radius + radius2) {
            System.out.println("the circles are separate and do not intersect");
        } else if (distance < Math.abs(radius - radius2)) {
            System.out.println(", one circle is inside the other and they do not intersect.\r");
        } else if (distance == 0 && radius == radius2) {
            System.out.println("the circles are coincident (infinite intersection points).");
        } else {
            System.out.println(" the circles intersect");
        }
    }
}
