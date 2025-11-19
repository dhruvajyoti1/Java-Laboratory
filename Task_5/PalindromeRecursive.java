public class PalindromeRecursive {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? " + result);
    }

    public static boolean isPalindrome(String s, int left, int right) {

        s = s.toLowerCase().replaceAll("[^a-z]", "");

        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int left, int right) {

        if (left >= right) {
            return true;
        }


        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }


        return checkRecursive(s, left + 1, right - 1);
    }
}

