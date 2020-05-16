import java.util.*;


public class Main {
    private static Random random = new Random();

    //ONLY GENERATE THE FOLLOWING
    private enum Generate { UPPERCASE, LOWERCASE, NUMBERS };

    public static void main(String[] args) {
        // write your code here
        Scanner readIn = new Scanner(System.in);
        int upperCaseLetters = readIn.nextInt();
        int lowerCaseLetters = readIn.nextInt();
        int integerNumbers = readIn.nextInt();
        int totalSymbols = readIn.nextInt();
        int total = 0;

        //The Password Structure as below
        String upperCase = generateSymbols(upperCaseLetters, Generate.UPPERCASE);
        String lowerCase = generateSymbols(lowerCaseLetters, Generate.LOWERCASE);
        String numbers = generateSymbols(integerNumbers, Generate.NUMBERS);
        String password = upperCase + lowerCase + numbers;
        if ((total = upperCaseLetters + lowerCaseLetters + integerNumbers) < totalSymbols) {
            password += generateSymbols(totalSymbols - total, Generate.UPPERCASE);
        }

        //Print out the Password
        System.out.println(password);

    }

    /*
    *@param count
    * @param enum value
    * Giver the two parameters set up the random value generator to produce a bounded result of
    * a english letter character (upper or lower case) or a number from 0 to 9
     */
    private static String generateSymbols(int noOfSymbols, Generate value) {
        int randomBound = 10;       //Generate random value from 0 to 9
        int utfOffset = 0;         //In use to print out Unicode Characters
        String output = "";         //return this output reference.
        int count = 0;

        switch (value) {
            case UPPERCASE:
                randomBound = 26;       //Generate numbers ranged to 26
                utfOffset = 65;         //Unicode 'A'
                break;

            case LOWERCASE:
                randomBound = 26;       //random value is bounded to 26
                utfOffset = 97;         //Unicode 'a'
                break;

            case NUMBERS:
                utfOffset = 48;         //Unicode '0'
                break;
            default :

        }

        //Generate random symbols
        while (count++ < noOfSymbols) {
            int randomValue = random.nextInt(randomBound);
            String generateSymbol = Character.toString(utfOffset + randomValue);

            //if the adjacent Symbols are the same regenerate the symbol again
            while (output.length() >= 1 && generateSymbol.equals(output.substring(output.length() - 1))) {
                generateSymbol = Character.toString(utfOffset + random.nextInt(randomBound));
            }
            output += generateSymbol;
        }

        return output;
    }
}