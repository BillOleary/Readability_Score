import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String howBigIsTheArray = readIn.nextLine();
        String readNumbers = readIn.nextLine().replace(" ", "");
        String[] testFor = readIn.nextLine().split(" ");
        String regex = "(" + testFor[0] + testFor[1] + "|" + testFor[1] + testFor[0] + ")";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(readNumbers);

        System.out.println(matcher.find());

    }
}