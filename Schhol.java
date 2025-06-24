import java.util.*;

public class Schhol {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Exam score:(0-100) ");
        double score = scn.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("Please enter a validate range");
            return;
        }
        System.out.println("Attandance pertange (0-100): ");
        double attandance = scn.nextDouble();
        if (attandance < 0 || attandance > 100) {
            System.out.println("Please enter a validate range");
            return;
        }
        System.out.println("Participiton level :(High,Medium,Low) ");
        scn.nextLine();
        String level = scn.nextLine();
        if (level == null) {
            System.out.println("Please enter a validate range");
            return;
        }
        String grade = null;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "FF";
        }

        if (attandance < 75) {

            if (grade.equals("A"))
                grade = "B";
            else if (grade.equals("B"))
                grade = "C";
            else if (grade.equals("C"))
                grade = "D";
            else if (grade.equals("D"))
                grade = "F";

        }

        if (level.equalsIgnoreCase("High")) {

            if (grade.equals("F"))
                grade = "D";
            else if (grade.equals("D"))
                grade = "C";
            else if (grade.equals("C"))
                grade = "B";
            else if (grade.equals("B"))
                grade = "A";

        } else if (level.equalsIgnoreCase("Low")) {

            if (grade.equals("A"))
                grade = "B";
            else if (grade.equals("B"))
                grade = "C";
            else if (grade.equals("C"))
                grade = "D";
            else if (grade.equals("D"))
                grade = "F";

        }
        System.out.println(grade);
    }
}
