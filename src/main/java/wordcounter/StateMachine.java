package wordcounter;

// simple 3-state StateMachine

class StateMachine {

    private static final String SENTENCE_DELIMITERS = "!?.";
    private static final String WORD_DELIMITER = " ";

    private State state;

    StateMachine() {
        state = State.SENTENCE_DELIMITER;
    }

    private enum State {
        WORD,
        WORD_DELIMITER,
        SENTENCE_DELIMITER
    }

    enum Signal {
        SENTENCE_END,
        WORD_START,
        EMPTY_SIGNAL
    }

    Signal update(char letter) {
        State newState = getNewState(letter);

        // produce no Signal for self-transitions
        // priduce no Signal for transition to WORD_DELIMITER
        Signal result;
        if (state == newState) {
            result = Signal.EMPTY_SIGNAL;
        } else {
            result = switch (newState) {
                case SENTENCE_DELIMITER -> Signal.SENTENCE_END;
                case WORD -> Signal.WORD_START;
                default -> Signal.EMPTY_SIGNAL;
            };
        }
        state = newState;
        return result;
    }


    private static State getNewState(char letter) {
        if (SENTENCE_DELIMITERS.indexOf(letter) > -1) {
            return State.SENTENCE_DELIMITER;
        } else if (WORD_DELIMITER.indexOf(letter) > -1) {
            return State.WORD_DELIMITER;
        } else {
            return State.WORD;
        }
    }
}
