package readability;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner readIn = new Scanner(System.in);
        String[] read = readIn.nextLine().split("");
        count += read.length;
        System.out.println(count <= 100 ? "EASY" : "HARD");

    }
}
