import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("a\ta^2\ta^3");
        System.out.println("1\t1\t1");
        System.out.println("2\t4\t8");
        System.out.println("3\t9\t27");
        System.out.println("4\t16\t64");
        System.out.println((9.5 * 4.5) - (2.5 * 3) / (45.5 - 3.5));
        System.out
                .println(4 * (1 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0)));
        double radius = 5.5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("AREA: " + area + " PERİMETER: " + perimeter);
        System.out.println("CELCULUS DEGREE:");
        double celcius = scn.nextDouble();
        double fahrenahit = (9.0 / 5) * (celcius) + 32;
        System.out.println(fahrenahit);
    }
}
