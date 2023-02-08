package ArraysAndHashing;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] splitStrings = s.split(" ");
        return splitStrings[splitStrings.length - 1].length();
    }
}
