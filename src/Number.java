public class Number {

    private char number;
    private char[] letters;
    private int index = 0;
    private int nextIndex;

    public Number(char number) throws InvalidInputException {
        this.number = number;
        letters = LetterMap.getMatchingLettersForNumber(number);

    }

    public char getCurrentLetter() {
        return letters[index];
    }

    public char getNextLetter() {
        if (index < letters.length) {

            return letters[index++];

        }
        return 0x00;
    }

    public boolean moveToNextLetter() {
        nextIndex = letters.length - 1;

        while (nextIndex >= 0 && nextIndex >= letters.length) {
            nextIndex--;
            return false;
        }

        // index++;

//        if (index >= letters.length) {
//            return false;
//        }

        return true;

    }

    public void resetIndex() {
        index = 0;
    }
}