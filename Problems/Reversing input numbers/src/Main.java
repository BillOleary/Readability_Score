import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String[] values = readIn.nextLine().split(" ");

        System.out.println(values[values.length - 1] + " " + values[values.length - 2]);

        //Another way to solve the problem using the formatted printf method.
        //System.out.printf("%2$d %1$d", readIn.nextInt(), readIn.nextInt());
    }
}