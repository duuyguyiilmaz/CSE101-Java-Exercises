import java.util.*;

public class FolkemonCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter attack (1 or 2 )");
        int attack = scn.nextInt();
        System.out.println("Enter coin toss result for first coin (0 for tails, 1 for heads, 2 for random):");
        int coin1 = scn.nextInt();
        System.out.println("Enter coin toss result for second coin (0 for tails, 1 for heads, 2 for random):");
        int coin2 = scn.nextInt();
        if (coin1 == 2) {
            coin1 = (int) (Math.random() * 2);
        }
        if (coin2 == 2) {
            coin2 = (int) (Math.random() * 2);
        }
        switch (attack) {
            case 1:
                if (coin1 == 1 && coin2 == 1) {
                    System.out.println("50 damage");
                } else {
                    System.out.println("0 Damage");
                }
                break;
            case 2:
                int count = 0;
                if (coin1 == 1)
                    count++;
                if (coin2 == 1)
                    count++;
                int damage = 50 + (count * 20);
                System.out.println("Attack damage : " + damage);
                break;
            default:
                System.out.println("Invalid attack type. Please enter 1 or 2.");
                break;
        }
    }
}
