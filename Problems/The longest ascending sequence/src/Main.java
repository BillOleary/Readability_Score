import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int sizeOfArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();

        int nextValue = Integer.MIN_VALUE;      //initialise the values
        int previousValue = Integer.MIN_VALUE;  //initialise the values
        int maxContiguousIndexLength = 0;   //the maximum contiguous length
        int maxLength = 1;                  //Keep a tab on the max length

        while (readIn.hasNextInt()) {
            nextValue = readIn.nextInt();
            maxContiguousIndexLength = (nextValue >= previousValue) ? ++maxContiguousIndexLength : 1;
            maxLength = maxLength > maxContiguousIndexLength ? maxLength : maxContiguousIndexLength;
            //System.out.println(previousValue + " " + nextValue + " \u2192" + maxContiguousIndexLength);
            previousValue = nextValue;

        }
        System.out.println(maxLength);
    }
}