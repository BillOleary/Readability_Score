import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int a = readIn.nextInt();
        int b = readIn.nextInt();
        int c = readIn.nextInt();

        double perimeter = (double) (a + b + c) / 2;

        System.out.println(Math.sqrt(perimeter *
                                    (perimeter - a) *
                                    (perimeter - b) *
                                    (perimeter - c))
                            );
    }
}