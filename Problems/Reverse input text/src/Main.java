import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String readString = reader.readLine();
        int length = readString.length();
        while (length != 0) {
            System.out.print(readString.charAt(--length));
        }
        reader.close();
    }
}