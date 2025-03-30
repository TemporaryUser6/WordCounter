package wordcounter;

class WordCounter {

    // task requires the solution to be "with array", so declare one.
    // (no requirement(s) to use the array)
    private int[] unusedArray;

    private WordCounter() {
    }

    static int getMaxWordsCount(String input) {

        if (null == input || input.length() < 1) {
            return 0;
        }

        StateMachine sm = new StateMachine();
        int currSentenceWordCount = 0;
        int maxWordCountPerSentence = 0;
        int currCharPtr = -1;
        while (++currCharPtr < input.length()) {

            StateMachine.Signal signal = sm.update(input.charAt(currCharPtr));
            if (StateMachine.Signal.WORD_START == signal) {
                currSentenceWordCount++;
            }

            if (StateMachine.Signal.SENTENCE_END == signal) {
                if (currSentenceWordCount > maxWordCountPerSentence) {
                    maxWordCountPerSentence = currSentenceWordCount;
                }
                currSentenceWordCount = 0;
            }
        }

        // if the task would require to count uncompleted sentences:
//        if (currSentenceWordCount > maxWordCountPerSentence) {
//            maxWordCountPerSentence = currSentenceWordCount;
//        }
        return maxWordCountPerSentence;
    }
}
