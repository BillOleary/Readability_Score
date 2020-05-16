import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String dnaSequence = readIn.nextLine();
        String regexSeq = "(a+|b+|c+|d+|e+|f+|g+|h+|i+|j+|k+|l+|m+|n+|o+|p+|q+|r+|s+|t+|u+|v+|w+|x+|y+|z+|" +
                            "A+|B+|C+|D+|E+|F+|G+|H+|I+|J+|K+|L+|M+|N+|O+|P+|Q+|R+|S+|T+|U+|V+|W+|X+|Y+|Z+)";
        String compressedSequence = "";

        Pattern pattern = Pattern.compile(regexSeq, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(dnaSequence);
        while (matcher.find()) {
            char sequence = matcher.group(0).charAt(0);
            compressedSequence += sequence + Integer.toString(matcher.end() - matcher.start());

        }
        System.out.println(compressedSequence);
    }
}