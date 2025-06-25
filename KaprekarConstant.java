import java.util.*;

public class KaprekarConstant {
    public static void main(String[] args) {
        System.out.println("Steps: " + stepCount(12345));
        System.out.println("Steps: " + stepCount(3524));

    }

    public static int stepCount(int n) {
        int count = 0;
        if (isValidKaprekar(n)) {
            boolean condition = true;
            while (condition) {
                int high = sortDecreasing(n);
                int low = sortIncreasing(n);
                int result1 = high - low;
                n = result1;
                count++;
                if (result1 == 6174 || result1 == 0) {
                    condition = false;
                    break;
                }
            }
        }
        return count;
    }

    public static boolean isValidKaprekar(int n) {
        String s = String.valueOf(n);
        int lengthofString = s.length();
        if (lengthofString < 2 || lengthofString > 4) {
            System.out.println("It is not a valid value");
            return false;
        }
        char firstDigit = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstDigit) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        }
        return false;
    }

    public static int sortIncreasing(int n) {
        String stringofN = String.valueOf(n);
        char[] charofString = new char[stringofN.length()];
        for (int i = 0; i < stringofN.length(); i++) {
            charofString[i] = stringofN.charAt(i);
        }
        Arrays.sort(charofString);
        String result = "";
        for (int i = 0; i < charofString.length; i++) {
            result += charofString[i];
        }
        return Integer.parseInt(result);
    }

    public static int sortDecreasing(int n) {
        String stringofN = String.valueOf(n);
        char[] charofString = new char[stringofN.length()];
        for (int i = 0; i < stringofN.length(); i++) {
            charofString[i] = stringofN.charAt(i);
        }
        Arrays.sort(charofString);
        String result = "";
        for (int i = charofString.length - 1; i >= 0; i--) {
            result += charofString[i];
        }
        return Integer.parseInt(result);
    }
}