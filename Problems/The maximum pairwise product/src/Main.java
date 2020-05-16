import java.util.Scanner;

/*
* TO find the max product of two numbers in an array, you read the values
* of each element and put them into two buckest
* bucket 1 Max value of the entire array
* bucket 2 the next max value of the entire array
* Now you have two numbers whose product IS the max
 */
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        //Read all values from the I/P Src
        int sizeOfTheArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();
        int nextValueRead = 0;
        int maxValue = Integer.MIN_VALUE;               //The start min value
        int precedingMaxValue = Integer.MIN_VALUE;      //This is the next min value

        while (readIn.hasNextInt()){
            nextValueRead = readIn.nextInt();
            //I got stumped trying to figure out the correct protocol for finding
            //the next highest number and so "borrowed" from the site
            //https://stackoverflow.com/questions/2615712/finding-the-second-highest-number-in-array
            //by Scott Smith
            //Note : I did not want to go the route of sorting the results which also
            //produces the same result i.e finding the largest and the second largest values
            //which can then be multiplied to form your answer.
            if (nextValueRead > maxValue) {
                precedingMaxValue = maxValue;
                maxValue = nextValueRead;
            }
            else {
                if (nextValueRead > precedingMaxValue) {
                    precedingMaxValue = nextValueRead;
                }
            }
        }
        System.out.println((long) maxValue * precedingMaxValue);
    }
}