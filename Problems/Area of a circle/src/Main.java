import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double radius = readIn.nextDouble();

        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}