import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String arraySize = readIn.nextLine();
        String array = readIn.nextLine().replace(" ", "");
        String valueToTestFor = readIn.nextLine();


        Pattern pattern = Pattern.compile(valueToTestFor, Pattern.MULTILINE);
        Matcher match = pattern.matcher(array);

        System.out.println(match.find());
    }
}