import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String readString = readIn.nextLine();
        int length = readString.length();
        int firsChar = readString.charAt(0);
        int lastChar = readString.charAt(length - 1);

        //Test if the length of the given string is the same as the
        //difference between the first character and the last character
        //in the string
        //e.g. bce -> 98,99,101
        //diff is 101 - 98 = 4 chars
        //and length of the string read from the console is bce 3chars
        //comparison of the two values is what is output.
        System.out.println(lastChar - firsChar == length - 1);

        //***********OR****************
//        String generateTrueOrderedSet = "";
//        int output = -1;
//        while (firsChar <= lastChar) {
//            generateTrueOrderedSet += Character.toString(firsChar++);
//            output = generateTrueOrderedSet.compareTo(readString);
//        }
//
//        System.out.println(output == 0);
    }
}