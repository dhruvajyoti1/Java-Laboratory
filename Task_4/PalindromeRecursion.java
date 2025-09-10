class PalindromeRecursion {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba".replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }
}
