import java.util.Scanner;

public class Assignment2_20220808704 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your first name>>> ");
        String firstName = scn.nextLine();
        System.out.println("Please enter your surname>>> ");
        String surname = scn.nextLine();
        double startingBalance;
        do {
            System.out.println("Please enter your starting balance>>> ");
            startingBalance = scn.nextDouble();
            if (startingBalance < 0) {

                System.out.println("Please enter valid balance.");

            }
        } while (startingBalance < 0);
        boolean condition = true;
        do {
            System.out.print("Hello " + " ");
            System.out.print(firstName.substring(0, 1).toUpperCase());
            System.out.print(firstName.substring(1).toLowerCase() + " ");
            System.out.println(surname.toUpperCase());
            System.out.println("What would you like to do today? ");
            String balance = "B";
            String withdraw = "W";
            String deposit = "D";
            String payment = "P";
            String quit = "Q";
            System.out.println("B to see (B)alance in your account");
            System.out.println("W to (W)ithdraw cash ");
            System.out.println("D to  (D)deposit cash");
            System.out.println("P to (P)ay a bill");
            System.out.println("Q to (Q)uit");
            System.out.println("Please enter your selection>>> ");
            String selection = scn.next().toUpperCase();
            switch (selection) {
                case "B":
                    System.out.println("Your current balance is " + startingBalance);
                    break;
                case "W":
                    System.out.println("How much are you withdrawing? ");
                    double withdrawAmount = scn.nextDouble();
                    if (withdrawAmount <= startingBalance && withdrawAmount > 0) {
                        double withdrawAmount2 = withdrawAmount * 100;
                        int c200 = (int) Math.floor(withdrawAmount2 / 20000);
                        withdrawAmount2 %= 20000;
                        int c100 = (int) Math.floor(withdrawAmount2 / 10000);
                        withdrawAmount2 %= 10000;
                        int c50 = (int) Math.floor(withdrawAmount2 / 5000);
                        withdrawAmount2 %= 5000;
                        int c20 = (int) Math.floor(withdrawAmount2 / 2000);
                        withdrawAmount2 %= 2000;
                        int c10 = (int) Math.floor(withdrawAmount2 / 1000);
                        withdrawAmount2 %= 1000;
                        int c5 = (int) Math.floor(withdrawAmount2 / 500);
                        withdrawAmount2 %= 500;
                        int c1 = (int) Math.floor(withdrawAmount2 / 100);
                        withdrawAmount2 %= 100;
                        int c05 = (int) Math.floor(withdrawAmount2 / 50);
                        withdrawAmount2 %= 50;
                        int c025 = (int) Math.floor(withdrawAmount2 / 25);
                        withdrawAmount2 %= 25;
                        int c010 = (int) Math.floor(withdrawAmount2 / 10);
                        withdrawAmount2 %= 10;
                        int c005 = (int) Math.floor(withdrawAmount2 / 5);
                        withdrawAmount2 %= 5;
                        int c0010 = (int) withdrawAmount2;
                        System.out.println("You will receive the following:");
                        if (c200 > 0)
                            System.out.println(c200 + " - 200");
                        if (c100 > 0)
                            System.out.println(c100 + " - 100");
                        if (c50 > 0)
                            System.out.println(c50 + " - 50");
                        if (c20 > 0)
                            System.out.println(c20 + " - 20");
                        if (c10 > 0)
                            System.out.println(c10 + " - 10");
                        if (c5 > 0)
                            System.out.println(c5 + " - 5");
                        if (c1 > 0)
                            System.out.println(c1 + " - 1");
                        if (c05 > 0)
                            System.out.println(c05 + " - 0.50");
                        if (c025 > 0)
                            System.out.println(c025 + " - 0.25");
                        if (c010 > 0)
                            System.out.println(c010 + " - 0.10");
                        if (c005 > 0)
                            System.out.println(c005 + " - 0.05");
                        if (c0010 > 0)
                            System.out.println(c0010 + " - 0.01");

                        startingBalance -= withdrawAmount;
                        System.out.println("Your current balance is: " + (startingBalance));
                    } else {
                        System.out.println("Please enter valid withdraw amount");
                    }
                    System.out.println("Have nice day! ");
                    break;
                case "D":
                    System.out.println("How much are you depositing? ");
                    double depositAmount = scn.nextDouble();
                    if (depositAmount > 0) {
                        startingBalance += depositAmount;
                        System.out.println("Your current balance is: " + startingBalance);
                    } else {
                        System.out.println("Error: Invalid deposit amount");
                    }
                    break;
                case "P":
                    double bill = (double) ((0.01 + Math.random() * 99.99) * 100);
                    bill = Math.round(bill) / 100;
                    System.out.println("Which of the following bills would you like to pay? ");
                    System.out.println("1-Electricity");
                    System.out.println("2-Water");
                    System.out.println("3-Internet");
                    System.out.println("Please enter your selection>>> ");
                    int selection2 = scn.nextInt();
                    if (startingBalance > bill) {
                        String yes = "Y";
                        String no = "N";
                        if (selection2 == 1) {
                            System.out.println("Your electricity bill is " + bill);
                            System.out.println("Do you wish to pay this bill now?(Y/N)");
                            String yesNO = scn.next();
                            if (yesNO.equals("Y")) {
                                {
                                    System.out.println("Thank you for your payment.");
                                    startingBalance -= bill;
                                }
                            } else if (yesNO.equals("N")) {
                                System.out.println("Have a nice day.");
                            } else {
                                System.out.println("Please enter a valid input");
                            }
                        } else if (selection2 == 2) {
                            System.out.println("Your water bill is " + bill);
                            System.out.println("Do you wish to pay this bill now?(Y/N)");
                            String yesNO = scn.next();
                            if (yesNO.equals("Y")) {
                                System.out.println("Thank you for your payment.");
                                startingBalance -= bill;
                            } else if (yesNO.equals("N")) {
                                System.out.println("Have a nice day.");
                            } else {
                                System.out.println("Please enter a valid input");
                            }
                        } else if (selection2 == 3) {
                            System.out.println("Your internet bill is " + bill);
                            System.out.println("Do you wish to pay this bill now?(Y/N)");
                            String yesNO = scn.next();
                            if (yesNO.equals("Y")) {
                                System.out.println("Thank you for your payment.");
                                startingBalance -= bill;

                            } else if (yesNO.equals("N")) {
                                System.out.println("Have a nice day.");
                            } else {
                                System.out.println("Please enter a valid input");
                            }
                        }
                        break;
                    } else {
                        System.out.println("You don't have sufficient funds to pay this bill.");
                    }

                case "Q":
                    System.out.println("Thank you for using our ATM.Have nice day. ");
                    condition = false;
                    break;
                default:
                    System.out.println("Please enter a valid selection");
            }

        } while (condition);

    }
}