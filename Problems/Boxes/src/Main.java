import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner readIn = new Scanner(System.in);
        int[] box1 = Stream.of(readIn.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] box2 = Stream.of(readIn.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //Min and Max Value of each Box
        //minMaxBox1[0] -> min Value of Box
        //minMaxBox1[1] -> max Value of Box
        int[] minMaxBox1 = {0, 0};
        int[] minMaxBox2 = {0, 0};

        //Populate the Max and Min values of the boxes

        //For Box 1
        minMaxBox1 = findBoxMinMax(box1);
        //For Box 2
        minMaxBox2 = findBoxMinMax(box2);


        makeDecision(minMaxBox1[0], minMaxBox1[1], minMaxBox2[0], minMaxBox2[1]);
    }


    /*
     * Find the min and max for the box lengths.
     * The code below find the min and max via first principles.
     * The same could be done by sorting the array which would give the min and max value via the first and
     * the last element in the sorted array.
     */
    private static int[] findBoxMinMax(int[] box) {
        int boxMin = Integer.MAX_VALUE;
        int boxMax = Integer.MIN_VALUE;

        for (int index = 0; index < box.length; index++) {
            if (box[index] > boxMax) {
                boxMin = boxMax == Integer.MIN_VALUE ? boxMin : boxMin < box[index] ? boxMin : boxMax;
                boxMax = box[index];
            } else {
                if (box[index] < boxMin) {
                    boxMin = box[index];
                }
            }
        }
        return new int[]{boxMin, boxMax};
    }

    /*
    * Based on the values sent over makes a decision on Box1 being equal, less than or greater than or incomparable
    * to Box 2
     */
    private static void makeDecision(int box1Min, int box1Max, int box2Min, int box2Max) {
        if (box1Min == box2Min && box1Max == box2Max) {
            System.out.println("Box 1 = Box 2");
        } else {
            if (box1Min >= box2Min && box1Max >= box2Max) {
                System.out.println("Box 1 > Box 2");
            } else {
                if (box2Min >= box1Min && box2Max >= box1Max) {
                    System.out.println("Box 1 < Box 2");
                } else {
                    System.out.println("Incomparable");
                }
            }
        }
    }

}