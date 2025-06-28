
import java.util.Scanner;

public class AtmSystem     {
    public static void main(String[] args) {
        System.out.println("Please enter your balance: ");
        Scanner scn = new Scanner(System.in);
        double balance = scn.nextDouble();
        if (balance >= 0) {
            System.out.println("What would like you today?  ");
            System.out.println("1 To see your balance");
            System.out.println("2 To withdraw cash");
            System.out.println("3 To Deposit cash");
            System.out.println("4 To exit");
            System.out.println("Enter your choice:");
            int choice = scn.nextInt();
            if (choice == 1) {
                System.out.println("Your current balance is: " + balance);
                System.out.println("Have a nice day!");
            } else if (choice == 2) {
                System.out.println("Please enter the amount to withdraw:");
                double withdraw = scn.nextDouble();
                if (withdraw < balance && withdraw > 0) {
                    System.out.println("Your current balance is: " + (balance - withdraw));
                    System.out.println("Have a nice day!");
                } else {
                    System.out.println("Error: Invalid withdraw amount");
                    System.out.println("Have a nice day!");
                }
            } else if (choice == 3) {
                System.out.println("Please enter the amount to deposit: ");
                double deposit = scn.nextDouble();
                if (deposit > 0) {
                    System.out.println("Your current balance is: " + (balance + deposit));
                    System.out.println("Have a nice day!");

                } else {
                    System.out.println("Error: Invalid deposit amount");
                    System.out.println("Have a nice day!");
                }

            } else if (choice == 4) {
                System.out.println("Existing system");
                System.out.println("Have a nice day!");

            } else {
                System.out.println("Error: Invalid choice");
                System.out.println("Have a nice day!");
            }
        } else {
            System.out.println("Error: Invalid balance");
            System.out.println("Have a nice day!");
        }
    }

}
