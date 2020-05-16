import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String word = readIn.nextLine();
        int length = word.length();
        boolean evenValue = length % 2 == 0;
        int midPoint = length/2;

        String withoutMiddleChar = evenValue ?
                (word.substring(0, midPoint - 1) + word.substring(midPoint + 1, length)) :
                (word.substring(0, midPoint) + word.substring(midPoint + 1, length));

        System.out.println(withoutMiddleChar);
    }
}