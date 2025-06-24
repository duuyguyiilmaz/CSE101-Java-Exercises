public class MultipleSumCalculator {
    public static void main(String[] args) {
        System.out.println(calculateSumOfMultiples(15));
    }

    public static int calculateSumOfMultiples(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
