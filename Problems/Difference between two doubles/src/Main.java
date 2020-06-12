import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double firstNumber = readIn.nextDouble();
        double secondNumber = readIn.nextDouble();

        System.out.println(secondNumber - firstNumber);
    }
}