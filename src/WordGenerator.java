import java.util.ArrayList;

public class WordGenerator {


    public ArrayList<String> getPossibleWords(String inputNumber) throws InvalidInputException {

        if (inputNumber.matches("^ *[0-9][0-9 ]*$") && inputNumber.length() > 0) {

            ArrayList<Number> digits = new ArrayList<>();

            for (int i = 0; i < inputNumber.length(); i++) {
                digits.add(new Number(inputNumber.charAt(i)));
            }

            return getPermutations(digits);


        } else {
            throw new InvalidInputException("The input should include numbers from 0 to 9");
        }
    }

    private ArrayList<String> getPermutations(ArrayList<Number> digits) {

        System.out.println("Generating Words");
        ArrayList<String> words = new ArrayList<>();

        int indexArraySize = digits.size();

        int calculatedIndex = -1;

        int nextChangedLetter = digits.size() - 1;

        while (true) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < indexArraySize; i++) {
                stringBuilder.append(digits.get(i).getCurrentLetter());
            }
            words.add(stringBuilder.toString());

            return words;


        }

//        while (true) {
//
//            StringBuilder word = new StringBuilder();
//
//            boolean shouldBePrinted = true;
//
//            for (int i = 0; i < digits.size(); i++) {
//                if (i == nextChangedLetter) {
//                    for (int j = nextChangedLetter; j < digits.size(); j++) {
//                        char letter = digits.get(nextChangedLetter).getNextLetter();
//                        if (letter == 0x00) {
//                            if (nextChangedLetter == 0) {
//                                // nextChangedLetter=digits.size() - 1;
//                                return;
//                            }
//                            digits.get(nextChangedLetter).resetIndex();
//                            if (!digits.get(nextChangedLetter - 1).moveToNextLetter()) {
//                                nextChangedLetter--;
//                            }
//                            shouldBePrinted = false;
//                            break;
//                        } else {
//                            word.append(letter);
//                        }
//                    }
//                } else {
//                    word.append(digits.get(i).getCurrentLetter());
//                }
//
//            }
//            if (shouldBePrinted)
//                System.out.println(word);
//
//        }


    }


}
