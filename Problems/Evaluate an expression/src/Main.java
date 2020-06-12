import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double readA = readIn.nextDouble();
        double readB = readIn.nextDouble();
        double readC = readIn.nextDouble();
        double readD = readIn.nextDouble();

        System.out.println((readC + readD) / 2.2D + readA * 10.5D + readB * 4.4D);
    }
}