public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println(characterCounter("heLlo", 'z'));
    }

    public static int characterCounter(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == character) {
                count++;
            }
        }
        return count;
    }
}
