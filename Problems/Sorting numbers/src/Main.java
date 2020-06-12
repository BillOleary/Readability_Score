
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        //Plain old vanilla sort implemented by the the Arrays API
        Arrays.sort(numbers);

        /**************SOLUTION 1 Recursive Bubble Sort**********************/
        /* //A Recursive Bubble sort from Mariano in Hyperskill.org
            //Arrays as parameters - Sorting numbers

        int aux;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                aux = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = aux;
                sort(numbers);
            }
        }

        */

        /*****************SOLUTION 2 Using a TreeMap DS for sorting numbers ***********************/
        /*
        //variation of counting sort by Mr dead Inside
        TreeMap<Integer, Integer> count = new TreeMap<>();

        for (int num : numbers) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (var pair : count.entrySet()) {
            int tmp = pair.getValue();

            while (tmp > 0) {
                numbers[index] = pair.getKey();
                tmp -= 1;
                index += 1;
            }
        }
         */

        /******************Swapping two numbers without a third temporary variable*****************/
        /*
        for (int x = 0; x<numbers.length; x++) {
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]){

                //keep a difference of the two comparable values in index+1 and use this later on on value at index
                numbers[i + 1] =  numbers[i] - numbers[i + 1]; // a = numbers[i] & b = numbers[i+1]

                numbers[i] = numbers[i] - numbers[i + 1];

                numbers[i + 1] = numbers[i + 1] + numbers[i];

            }
        }
         */

    }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }

}