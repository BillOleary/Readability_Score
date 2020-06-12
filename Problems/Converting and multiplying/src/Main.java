
import javax.xml.catalog.Catalog;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

class Main {
    static Scanner readIn = new Scanner(System.in);
    static String number = "";

    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);

        Object[] numbersArray = readIn.tokens().toArray();
        //Print out the values
        int index = 0;
        while (!((String) numbersArray[index++]).matches("0")) {
            try {
                number = (String) numbersArray[index];
                System.out.println(Integer.parseInt(number) * 10);
            } catch (NumberFormatException rtXception) {
                System.out.println("Invalid user input: " + number);

            }

        }

        //Recursive Method to print out
        //Prints out the values in reverse order
        //getValue(readIn.next());

    }

    //A Recursive way to print out the values
    public static String getValue(String value) {
        String currentValue = value;
        if (currentValue.matches("0")) {
            return currentValue;
        } else {
            try {
                getValue(readIn.nextLine());
                System.out.println(Integer.parseInt(currentValue) * 10);
            } catch (NumberFormatException nfXception) {
                System.out.println("Invalid user input: " + currentValue);
            }
        }
        return currentValue;
    }
}