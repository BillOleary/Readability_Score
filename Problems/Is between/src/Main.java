import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int firstNumber = readIn.nextInt();
        int secondNumber = readIn.nextInt();
        int thirdNumber = readIn.nextInt();

        System.out.println(firstNumber - secondNumber >= 0 && firstNumber - thirdNumber <= 0 ||
                            firstNumber - secondNumber <= 0 && firstNumber - thirdNumber >=0 ?
                            true :
                            false);
    }
}