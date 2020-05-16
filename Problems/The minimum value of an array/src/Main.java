import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int sizeOfArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();   //position the cursor on the next Line
        //int[] intArray = new int[sizeOfArray];
        //int count = 0;
        int readValue = 0;
        int minValue = Integer.MAX_VALUE;

        while (readIn.hasNextInt()) {
            //intArray[count++] = readIn.nextInt();
            readValue = readIn.nextInt();
            minValue = readValue < minValue ? readValue : minValue;
        }
        System.out.println(minValue);
    }
}