
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String url = readIn.nextLine();
        printMetaInfo(url);
    }


    private static void printMetaInfo(String url) {

        Pattern pattern = Pattern.compile("\\w+=([\\d|\\w]+)?", Pattern.MULTILINE);
        Matcher match = pattern.matcher(url);

        List<String> tokens = match.results().
                map(element -> element.group().replace("=", " : ")).
                map(value -> {
                    if (value.matches("\\w+ : \\w?")) {
                        value += "not found";
                    }
                    return value;
                }).
                collect(Collectors.toList());

        tokens.forEach(System.out::println);

        tokens.stream().
                filter(passString -> passString.matches("^pass : \\w+?")).
                forEach(value -> System.out.println(value.replaceAll("pass", "password")));

    }
}