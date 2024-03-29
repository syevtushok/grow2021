package task.java.five;

public class Solution1 {

    public static boolean validParentheses(String parens) {
        int count = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                count++;
            } else if (parens.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}
