public class DigitProductCalculator {
    public static void main(String[] args) {
        // Calculates the sum of digit products from 1 to n

        System.out.println(digitProductSum(12));

    }

    public static int digitProductSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int product = 1;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0) {
                    product = 0;
                    break;
                }
                product *= digit;
                temp /= 10;
            }
            total += product;
        }
        return total;
    }
}