import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double readX = readIn.nextDouble();

        System.out.println(Math.pow(readX, 3) + Math.pow(readX, 2) + readX + 1.0);
    }
}