import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        String previousString = readIn.next();
        String currentString;
        boolean contiguous = true;

        while (readIn.hasNext()) {
            currentString = readIn.next();
            //current string must be "less than" the prev string in value i.e < 0 returned
            //from the compareTo(...) method.
            int compareSting = currentString.compareTo(previousString);

             if (compareSting < 0) {
                 contiguous = false;
                 break;
             }
            previousString = currentString;
        }
        System.out.println(contiguous);
    }
}