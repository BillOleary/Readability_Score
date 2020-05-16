import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String stringRead;
        String largestString = "";

        while (readIn.hasNext()) {
            largestString = (stringRead = readIn.next()).length() > largestString.length() ?  stringRead : largestString;
//            stringRead = readIn.next();
//            if (stringRead.length() > largestString.length()) {
//                largestString = stringRead;
//            }
        }
        System.out.println(largestString);
    }
}