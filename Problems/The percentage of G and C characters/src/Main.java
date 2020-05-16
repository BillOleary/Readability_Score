import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);

        String gcContent = readIn.nextLine();
        String regeX = "[cCgG]";
        double percentRatio = 0;
        int count = 0;

        Pattern pattern = Pattern.compile(regeX, Pattern.MULTILINE);
        Matcher match = pattern.matcher(gcContent);

        while (match.find()) {
            percentRatio = (double) ++count / gcContent.length() * 100;
        }
        System.out.println(percentRatio);
    }
}