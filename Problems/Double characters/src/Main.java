import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String[] line = readIn.nextLine().split("");

        Stream.of(line).forEach(element -> System.out.print(element+element));
    }
}