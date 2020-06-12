import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        final double gravity = 9.8D;
        double liquidDensity = readIn.nextDouble();
        double columnHeight = readIn.nextDouble();

        System.out.println(gravity * liquidDensity * columnHeight);

    }
}