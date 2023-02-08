package ArraysAndHashing;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(subsequence("b", "abc"));
    }
    public static boolean subsequence(String s, String t) {
        var charsOne = s.toCharArray();
        var charsTwo = t.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int ii = 0;

        if(s.equals("")) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if(charsOne.length == ii) {
                return stringBuilder.toString().equals(s);
            }
            if(charsOne[ii] == charsTwo[i]) {
                stringBuilder.append(charsTwo[i]);
                ii++;
            }
        }
        return stringBuilder.toString().equals(s);

    }

}
