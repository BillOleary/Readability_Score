import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here

        //Make the number a String Array
        String[] readNumber = readIn.nextLine().split("");

        //The result of (number/10) % 10 is always the second last
        //value in the String value of the Number.
        //e.g (157/10) % 10 -> 15 % 10 = 5 the second last digit of
        //the number.
        //Also the right most digit is the Units position and the
        //left adjacent value is the tens placement.
        System.out.println(readNumber.length > 1 ?
                readNumber[readNumber.length - 2] :
                0);
    }
}