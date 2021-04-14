import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedHashMapTest {
    @Test
    public void givenASentence_whenWordsAreAddedToList_ShouldReturnParanoidFrequency(){
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting " +
                "themselves deliberately into paranoid avoidable situations";

        LinkedHashMap<String , Integer > customLinkedHashMap = new LinkedHashMap<>();
        String[] sentenceToWords = sentence.toLowerCase().split(" ");
        for (String word : sentenceToWords) {
            Integer value = customLinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            customLinkedHashMap.add(word,value);
        }
        customLinkedHashMap.remove("avoidable");
        int frequency = customLinkedHashMap.get("avoidable");
        Assertions.assertNull(frequency);
    }
}
