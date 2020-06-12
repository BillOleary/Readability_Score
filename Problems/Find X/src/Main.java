import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double readA = readIn.nextDouble();
        double readB = readIn.nextDouble();
        double readC = readIn.nextDouble();

        System.out.println((readC - readB)/readA);
    }
}