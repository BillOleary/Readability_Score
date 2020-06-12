import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String[] words = reader.readLine().split("\\s+");
        System.out.println(Stream.of(words).filter(element -> !element.matches("")).count());
        reader.close();
    }
}