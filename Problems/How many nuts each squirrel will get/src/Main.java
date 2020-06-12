import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int noOfSquirrels = readIn.nextInt();
        int noOfNuts = readIn.nextInt();

        System.out.println(noOfNuts / noOfSquirrels);
    }
}