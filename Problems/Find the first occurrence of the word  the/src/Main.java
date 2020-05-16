
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String sentence = readIn.nextLine();

        Pattern pattern = Pattern.compile("([T|t]he)[\\s|\\w+]?", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(sentence);

        //The first occurrence of the matched regex
        if (matcher.find()) {
            System.out.println(matcher.start());
        }
        else {
            System.out.println(-1);
        }
    }
}
