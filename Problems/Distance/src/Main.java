import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        double distanceInMiles = readIn.nextDouble();
        double timeInHours = readIn.nextDouble();

        System.out.println(distanceInMiles / timeInHours);
    }
}