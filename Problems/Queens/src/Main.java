import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int x1 = readIn.nextInt();
        int y1 = readIn.nextInt();
        int x2 = readIn.nextInt();
        int y2 = readIn.nextInt();

        boolean horizontalEquality = x1 - x2 == 0;
        boolean verticalEquality = y1 - y2 == 0;
        boolean diagonalEquality = x1 + y2 == x2 + y1;

        System.out.println(horizontalEquality || diagonalEquality || verticalEquality ? "YES" : "NO");

    }
}