import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        String[] readNumber = readIn.nextLine().split("");

        int index = readNumber[readNumber.length - 1].matches("0") ?
                    readNumber.length - 2 : readNumber.length - 1;
        String reversedNumber = "";

        for (; index >= 0; index--) {
            reversedNumber += readNumber[index];
        }
        System.out.println(reversedNumber);
    }
}