public class QuizJava {
    public static void main(String args[]) {
    }

    public String generatePalindrome(int n) {
        String result = "";
        String alphabet = "abcçdefgğhıijklmnoöprsştuüvyz";
        for (int i = 0; i < n / 2; i++) {
            int random = (int) (Math.random() * 30);
            result = result + alphabet.charAt(random);
        }
        if (n % 2 == 1) {
            String alphabet2 = "abcçdefgğhıijklmnoöprsştuüvyz";
            int random2 = (int) (Math.random() * 30);
            char middle = alphabet2.charAt(random2);
            result = result + middle;
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            result = result + result.charAt(i);
        }
        return result;
    }

    public String reverse(String word) {
        String result2 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result2 = result2 + word.charAt(i);
        }
        return result2;
    }

    public boolean isPalindrome(String p) {
        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(i) != p.charAt(p.length() - 1)) {
                return false;
            }
        }
        return true;

    }

    public void compareNames(String name1, String name2) {
        if (name1.length() == name2.length()) {
            if (name1.equals(name2)) {
                System.out.println("They are same");
            } else {
                System.out.println(name1.charAt(name1.length() - 2));
            }
        } else {
            if (name1.contains(name2)) {
                String replacement = name1.replace(name2, "");
                System.out.println(replacement.toUpperCase());
            } else if (name2.contains(name1)) {
                String replacement2 = name2.replace(name1, "");
                System.out.println(replacement2.toUpperCase());
            } else {
                System.out.print(name2.substring(1));
            }
        }
    }

    public String weekDay(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = " Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "invalid";
                break;
        }
        return day;
    }

}