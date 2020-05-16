import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String date = readIn.nextLine();

        String[] dateTokens = date.split("-");

        System.out.println(dateTokens[1] + "/" +
                            dateTokens[2] + "/" +
                            dateTokens[0]);
    }
}