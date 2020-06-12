import java.util.*;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String[] numbers = readIn.nextLine().split("");
        int sizeOfIntegerValue = numbers.length;
        int sum = 0;
        int count = 0;

        //As we get each value from the integer, we initially add up the
        //first N/2 numbers.
        //From this sum we then start to subtract the subsequent values.
        //If we reach a sum of 0 we print "YES" otherwise a "NO" is printed
        while (count < sizeOfIntegerValue) {
            int digit = Integer.parseInt(numbers[count++]);
            //at the half way point we start subtracting from the sum
            if (count > sizeOfIntegerValue / 2) {
                sum -= digit;
            }
            else {
                sum += digit;
            }
        }

        //Test the sum value remaining after the operation above.
        if (sum == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}