import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);

        double a = readIn.nextDouble();
        double b = readIn.nextDouble();
        double c = readIn.nextDouble();

        double denominator = 2 * a;
        double second = Math.sqrt(b * b - 4 * a * c) / denominator;

        double x1 = -b / denominator + second;
        double x2 = -b / denominator - second;
        System.out.println(x1 > x2 ? (x2 + " " + x1) : (x1 + " " + x2));
    }
}