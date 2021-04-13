import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashMapTest {

    /**
     * Testing the validity of the New hashmap
     */
    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnFrequency() {
        String sentence = "To be or not to be";
        HashMap<String, Integer> customHashMap = new HashMap<>();
        String[] sentenceToWords = sentence.toLowerCase().split(" ");
        for (String word : sentenceToWords) {
            Integer value = customHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            customHashMap.add(word, value);
        }
        int frequency = customHashMap.get("to");
        System.out.println(customHashMap);
        Assertions.assertEquals(2, frequency);

    }
}
