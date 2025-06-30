public class AnotherBasicPractices {
    public static void main(String args[]) {
        System.out.println(cashGiven(168.50, false));
        System.out.println(cashGiven(123.45, true));
        System.out.println(encode(12345));

    }

    public static String cashGiven(double amount, boolean all) {
        Double[] values = { 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };
        String result = "";
        for (double value : values) {
            int count = (int) (amount / value);
            if (count >= 1) {
                result += count + "-" + value + " ";
                amount -= count * value;
            }
        }
        return result;
    }

    public static int encode(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + encode(number / 10);
    }
}
