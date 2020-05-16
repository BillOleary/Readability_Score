import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner readIn = new Scanner(System.in);
        int noOfCompanies = readIn.nextInt();
        readIn.nextLine();

        String[] companyIncome = readIn.nextLine().split(" ");
        String[] percentTax = readIn.nextLine().split(" ");
        int companyNumber = 0;
        double companyTax;
        double maxTax = 0;

        for (int index = 0; index < noOfCompanies; index++) {
            companyTax = Double.parseDouble(companyIncome[index]) * Double.parseDouble(percentTax[index]) / 100;

            if (companyTax > maxTax) {
                maxTax = companyTax;
                companyNumber = index + 1;
            }
        }
        System.out.println(companyNumber);
    }
}