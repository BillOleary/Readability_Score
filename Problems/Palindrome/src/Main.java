import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);

        String read = readIn.nextLine();
        int readLength = read.length();
        String output = "yes";

        for (int index = 0; index <= readLength / 2; index++) {
            if (read.charAt(index) != read.charAt(readLength - index - 1)) {
                output = "no";
                break;
            }
        }
        System.out.println(output);
    }
}