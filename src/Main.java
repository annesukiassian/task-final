import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InvalidInputException {

        WordGenerator wordGenerator = new WordGenerator();
        System.out.print("Please enter your phone number -> ");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        ArrayList<String> possibleWords = wordGenerator.getPossibleWords(inputNumber);
        System.out.println(possibleWords.size());
        System.out.println(possibleWords);

    }
}
