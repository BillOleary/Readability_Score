import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int count = readIn.nextInt();
        int[] intArray = new int[count];
        int sum = 0;

        for (int index = 0; index < count; index++) {
            intArray[index] = readIn.nextInt();
            sum += intArray[index];
        }

        System.out.println(sum);
    }
}