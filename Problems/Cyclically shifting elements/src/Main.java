import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int sizeOfTheArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();

        String[] readValue = readIn.nextLine().split(" ");
        int nextIndex = 0;
        int count = 0;
        String nextValue;

        nextValue = readValue[0];
        while (count++ < sizeOfTheArray) {
            nextIndex = (nextIndex + 1) % sizeOfTheArray;
            String tempValue = readValue[nextIndex];
            readValue[nextIndex] = nextValue;
            nextValue = tempValue;
        }
        Stream.of(readValue).forEach(element -> System.out.print(element + " "));

    }
}