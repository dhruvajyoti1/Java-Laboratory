import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are Anagrams? " + result);
    }

    public static boolean areAnagrams(String s1, String s2) {

        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

    
        if (s1.length() != s2.length()) {
            return false;
        }


        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }
}
