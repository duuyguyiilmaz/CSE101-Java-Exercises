public class SumCalculator {
    public static void main(String args[]) {
        System.out.println(sumUpTo(2));
    }

    public static int sumUpTo(int n) {
        int sum = 0;
        int number = 1;
        while (number <= n) {
            sum += number;
            number++;
        }
        return sum;
    }
}
