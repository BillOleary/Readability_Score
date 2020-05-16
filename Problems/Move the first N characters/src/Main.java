import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
* Use string subSequence(...) method to chop up the string and shift them
* around (based on the rotate variable)
 */
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String line = readIn.nextLine();
        String word = line.substring(0, line.length() - 2);
        int rotateValue = Character.getNumericValue(line.charAt(line.length() - 1));

        if (rotateValue < word.length()) {
            moveSubString(word, rotateValue);
        } else {
            System.out.println(word);
        }
    }

    private static void moveSubString(String word, int rotate) {
        //String wordString = Stream.of(word).reduce("", (x,y) -> x+y);
        CharSequence startLetters = word.subSequence(0, rotate);
        CharSequence endLetters = word.subSequence(rotate, word.length());
        System.out.println(endLetters.toString()+startLetters.toString());

    }
}