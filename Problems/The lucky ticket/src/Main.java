import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int numbers = readIn.nextInt();
        //String dummyLine = readIn.nextLine();
        int sum = 0;
        int count = 0;

        //Add up all the numbers to get the sum of all
        //As we get each value from the integer, we initially add up the
        //three last numbers.
        //From this sum we then start to subtract the subsequent values.
        //If we reach o sum of 0 we are Lucky otherwise we have a Regular
        //ticket
        while (numbers > 0) {
            int lastDigit = numbers % 10;
            //at the third value onwards we start subtracting from the sum
            if (count++ > 2) {
                sum -= lastDigit;
            }
            else {
                sum += lastDigit;
            }
            numbers = numbers / 10;
            }

        //Test the sum value remaining after the operation above.
        if (sum == 0) {
            System.out.println("Lucky");
        }
        else {
            System.out.println("Regular");
        }
    }
}