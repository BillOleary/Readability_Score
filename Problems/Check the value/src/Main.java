import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int readValue = readIn.nextInt();

        System.out.println(readValue < 10 && readValue > 0);
    }
}