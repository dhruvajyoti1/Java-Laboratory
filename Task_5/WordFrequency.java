import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "The cat and the dog.";
        Map<String, Integer> frequencyMap = countWordFrequency(sentence);

        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String sentence) {
        // Normalize: lowercase + remove punctuation
        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = sentence.split("\\s+"); // split by spaces
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }
}
