import java.util.*;

class WordFrequency {
    public static void main(String[] args) {
        String text = "The cat and the dog.";
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (String word : freq.keySet()) {
            System.out.println(word + ": " + freq.get(word));
        }
    }
}
