package wordcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCounterTest {

    String sample1 = "  foo . bar bar???!. !?  foo bar  foo ! ?. ";
    String sample2 = "We are the best test coders. Give us a try? !f f f f f f f f f";
    String sample3 = "We are the best test coders. Give us a try?";

    String sample4 = "";
    String sample5 = null;
    String sample6 = "  ";
    String sample7 = "a!";

    @Test
    void basicTest() {
        assertEquals(3, WordCounter.getMaxWordsCount(sample1));
        assertEquals(6, WordCounter.getMaxWordsCount(sample2));
        assertEquals(6, WordCounter.getMaxWordsCount(sample3));

        assertEquals(0, WordCounter.getMaxWordsCount(sample4));
        assertEquals(0, WordCounter.getMaxWordsCount(sample5));
        assertEquals(0, WordCounter.getMaxWordsCount(sample6));
        assertEquals(1, WordCounter.getMaxWordsCount(sample7));
    }
}
