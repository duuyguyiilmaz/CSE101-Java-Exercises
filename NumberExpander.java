public class NumberExpander {
    public static void main(String[] args) {
        System.out.println(convertToExpandedForm(7250)); // "7000 + 200 + 50"
    }

    public static String convertToExpandedForm(int num) {
        String result = "";
        String numStr = Integer.toString(num);
        int length = numStr.length();

        for (int i = 0; i < length; i++) {
            char c = numStr.charAt(i);
            if (c != '0') {
                if (!result.isEmpty()) {
                    result += " + ";
                }
                result += c;
                for (int j = i + 1; j < length; j++) {
                    result += "0";
                }
            }
        }

        return result;
    }
}
