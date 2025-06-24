import java.util.*;

public class LoanSystem {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Credit score: ");
        int creditSccore = scn.nextInt();
        scn.nextLine();
        System.out.println("Employement Status: ");
        String employement = scn.nextLine();
        System.out.println("Annual İncome: ");
        double income = scn.nextDouble();
        System.out.println("Loan Amount: ");
        double loanamount = scn.nextDouble();
        scn.nextLine();
        System.out.print("Loan Purpose: ");
        String purpose = scn.nextLine();
        System.out.print("Existing Debts: ");
        double debts = scn.nextDouble();
        boolean eligible = true;
        if (purpose.equals("Home") && creditSccore < 700) {
            eligible = false;
        } else if (purpose.equals("Car") && creditSccore < 650) {
            eligible = false;
        } else if (purpose.equals("Education") && creditSccore < 600) {
            eligible = false;
        } else if (purpose.equals("Business") && creditSccore < 680) {
            eligible = false;
        } else if (purpose.equals("Personal") && creditSccore < 620) {
            eligible = false;
        }
        if (employement.equals("Employement") || employement.equals("Self-Employement")) {
            if (income < loanamount * 2) {
                eligible = false;
            }
        } else if (employement.equals("Unemployement") || employement.equals("Student")) {
            if (!purpose.equals("Education") || income < loanamount * 1.5) {
                eligible = false;
            }
        }
        double dti = debts / income;
        if (dti > 0.4) {
            eligible = false;
        }
        if (creditSccore < 600) {
            eligible = false;
        }
        if (!eligible) {
            System.out.println("Loan rejected");
            return;
        }
        double interest = 0;

        if (creditSccore >= 800 && creditSccore <= 850) {
            interest = 3.0;
        } else if (creditSccore >= 750) {
            interest = 4.0;
        } else if (creditSccore >= 700) {
            interest = 5.0;
        } else if (creditSccore >= 650) {
            interest = 6.0;
        } else if (creditSccore >= 600) {
            interest = 7.0;
        }
        if (purpose.equals("Home") && creditSccore < 700) {
            eligible = false;
        } else if (purpose.equals("Car") && creditSccore < 650) {
            eligible = false;
        } else if (purpose.equals("Education") && creditSccore < 600) {
            eligible = false;
        } else if (purpose.equals("Business") && creditSccore < 680) {
            eligible = false;
        } else if (purpose.equals("Personal") && creditSccore < 620) {
            eligible = false;
        }

        System.out.printf("Loan Approved. Assigned Interest Rate: %.2f%%\n", interest);

    }

}
