import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int count = readIn.nextInt();
        int[] intArray = new int[count];
        int max = 0;
        int maxIndex = 0;

        for (int index = 0; index < count; index++) {
            intArray[index] = readIn.nextInt();
            if (intArray[index] > max) {
                max = intArray[index];
                maxIndex = index;
            }
        }
        System.out.println(maxIndex);
    }
}