import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int sizeOfTheArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();

        //Variables used for finding the triples in the array
        int tripleCount = 0;        //how many triples are found!

        //Variables used for the Circular Buffer
        int sizeOfCircularBuffer = 3;
        int[] circularBuffer = new int[sizeOfCircularBuffer];
        int currentBufferIndexPosition = 1;      //it is 1 since we are filling in the array below
        int midIndexPosition;
        int index = 0;                      //current index position of the array;

        while (readIn.hasNextInt() && sizeOfTheArray >= sizeOfCircularBuffer) {
            if (index == 0) {
                //Run this before the loop is started
                circularBuffer[index++] = readIn.nextInt();//Store the first values in the buffer
                circularBuffer[index++] = readIn.nextInt();//Store the second values in the buffer
            }
            //We need this to test the condition below
            midIndexPosition = currentBufferIndexPosition;
            //New position to store the current read value
            currentBufferIndexPosition = (currentBufferIndexPosition + 1) % sizeOfCircularBuffer;
            //Fill in the buffer at position with the new value
            circularBuffer[currentBufferIndexPosition] = readIn.nextInt();

            /*       _Left___Mid__Current__
            *       |______|____|_________|
             */
            int leftOfMiddle = (midIndexPosition + sizeOfCircularBuffer - 1) % sizeOfCircularBuffer;

            boolean test = circularBuffer[midIndexPosition] - circularBuffer[leftOfMiddle] == 1 &&
                            circularBuffer[currentBufferIndexPosition] - circularBuffer[midIndexPosition] == 1;
            if (test) {
                tripleCount++;
            }
        }
        System.out.println(tripleCount);
    }
}