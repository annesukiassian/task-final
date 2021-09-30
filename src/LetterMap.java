import java.util.HashMap;
import java.util.Map;

public class LetterMap {
    private static final LetterMap instance;
    private final Map<Character, char[]> letters = new HashMap<>();

    private LetterMap() {
        letters.put(' ', new char[]{' '});
        letters.put('0', new char[]{'0'});
        letters.put('1', new char[]{'1'});
        letters.put('2', new char[]{'A', 'B', 'C'});
        letters.put('3', new char[]{'D', 'E', 'F'});
        letters.put('4', new char[]{'G', 'H', 'I'});
        letters.put('5', new char[]{'J', 'K', 'L'});
        letters.put('6', new char[]{'M', 'N', 'O'});
        letters.put('7', new char[]{'P', 'Q', 'R', 'S'});
        letters.put('8', new char[]{'T', 'U', 'V'});
        letters.put('9', new char[]{'W', 'X', 'Y', 'Z'});
    }

    static {
        try {
            instance = new LetterMap();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public Map<Character, char[]> getLetters() {
        return letters;
    }

    public static char[] getMatchingLettersForNumber(char number) throws InvalidInputException {
        if (instance.getLetters().containsKey(number)) {
            return instance.getLetters().get(number);
        } else {
            throw new InvalidInputException("Can't find symbol list for the given number");
        }
    }

}
