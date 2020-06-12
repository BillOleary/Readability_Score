import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int number = readIn.nextInt();
        //Use this variable for recursive aum call
        int findSumOf = number;
        int sum = number % 10;
        while ((number = number/10) != 0) {
            sum += number % 10;
        }

        System.out.println(sum);

        //Using a recursive method to calculate the sum
        //Uncomment line to solve problem
        System.out.println(getSum(findSumOf));

    }

    /*
    * Recursive Method call to solve sum of integer
     */
    private static int getSum(int number) {
        int sum = 0;
        int value = 0;

        //base case
        if (number == 0) {
            return 0;
        }
        else {
            sum += number % 10 + getSum(number / 10);
        }
        return sum;
    }
}