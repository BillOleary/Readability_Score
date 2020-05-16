import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        int count = 0;
        Scanner readIn = new Scanner(System.in);
        String arraySize = readIn.nextLine();
        String arrayInput = readIn.nextLine().replace(" ", "");
        String numberToSearchFor = readIn.nextLine().trim();

        Pattern pattern = Pattern.compile(numberToSearchFor, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(arrayInput);

        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}