
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        
        String sizeOfArray = readIn.nextLine();
        String[] arrayValues = readIn.nextLine().split(" ");
        int valueToFind = Integer.valueOf(readIn.nextLine());

//        final Integer sum = Arrays.asList(arrayValues).stream().
//                map(Integer::valueOf).
//                filter(element -> element > valueToFind).
//                reduce(0, (x, y) -> x + y);

        final Integer sum = Stream.of(arrayValues).
                mapToInt(Integer::valueOf).
                filter(element -> element > valueToFind).
                sum();
        System.out.println(sum);
    }

}