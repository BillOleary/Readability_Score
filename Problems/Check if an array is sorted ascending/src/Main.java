import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int sizeOfArray = readIn.nextInt();
        String dummyLine = readIn.nextLine();
        int previousValue = readIn.nextInt();
        int nextValue;
        boolean ascendingOk = true;

        while (readIn.hasNextInt()) {
            nextValue = readIn.nextInt();
            if (nextValue < previousValue) {
                ascendingOk = false;
                break;
            }
            previousValue = nextValue;
        }
        System.out.println(ascendingOk);
    }
}