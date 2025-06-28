import java.util.Arrays;

public class ExercisesJava {
    public static void main(String[] args) {
        int[] a = { 7 };
        System.out.println(Arrays.toString(reverseArry(a)));
        System.out.println(isValidPassword("Short1!"));

    }

    public static int[] reverseArry(int[] arrys) {
        int count = 0;
        int[] reversearray = new int[arrys.length];
        for (int i = arrys.length - 1; i >= 0; i--) {
            reversearray[count] = arrys[i];
            count++;
        }
        return reversearray;
    }

    public static boolean isValidPassword(String password) {
        int isNumeric = 0;
        int isUpperCase = 0;
        int isSpecialCharacter = 0;
        if (password.length() >= 10) {

            for (int i = 0; i < password.length(); i++) {
                char f = password.charAt(i);
                if (isNumeric(f)) {
                    isNumeric++;
                }
                if (isUpperCase(f)) {
                    isUpperCase++;
                }
                if (isSpecialCharacter(f)) {
                    isSpecialCharacter++;
                }
            }
        }

        return isNumeric >= 3 && isUpperCase >= 2 && isSpecialCharacter >= 3;
    }

    public static boolean isNumeric(char a) {
        char b[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUpperCase(char c) {
        char d[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'Ş', 'T',
                'U', 'V', 'Y', 'Z', 'w' };
        for (int i = 0; i < d.length; i++) {
            if (d[i] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialCharacter(char e) {
        if (!isNumeric(e) && !isLetter(e)) {
            return true;
        }
        return false;
    }

    public static boolean isLetter(char c) {
        char[] d = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'R', 'S', 'Ş', 'T', 'U', 'V', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'r', 's', 'ş', 't', 'u', 'v', 'y', 'z' };
        for (int i = 0; i < d.length; i++) {
            if (d[i] == c) {
                return true;
            }
        }
        return false;
    }
}
