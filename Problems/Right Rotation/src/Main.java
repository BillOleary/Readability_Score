
import java.util.Arrays;
import java.util.Scanner;
/*
* This is an in Place Circular Buffer to rearrange the values of the array based on the index.
*
 */
class Main {
    /*
    *We start with index 0 in the array and calculate the next index value that we move right to.
     * The original value at that index is placed in a temp holding position and we replace the values.
     *
     */
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String[] arrayOfValues = readIn.nextLine().split(" ");
        int rotate = readIn.nextInt();
        int length = arrayOfValues.length;
        int newIndex = 0;               //the next index to place the values in
        int count = 0;                  //used to count the
        int runCount = 0;               //loop the array length times to get all values swapped.

        //Store the start value which is the value at index 0
        String tempA = arrayOfValues[count];
        //run the loop length - 1 times
        while (runCount++ < length) {
           newIndex = (newIndex + rotate) % length;    //Circular Buffer type
           String tempB = arrayOfValues[newIndex];  //Keep a copy of the old value
           arrayOfValues[newIndex] = tempA;         //replace the new Index with the the previous value
           tempA = tempB;                           //The new temp value is now going to be replace for the next iteration.
           //count = newIndex;                        //Reset the count for the next iteration.
        }
       Arrays.asList(arrayOfValues).forEach(element -> System.out.print(element + " "));
    }
}