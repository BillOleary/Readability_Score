import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        // put your code here
        int heightH1 = readIn.nextInt();
        int heightH2 = readIn.nextInt();
        int heightH3 = readIn.nextInt();

        boolean greaterThan = heightH1 >= heightH2 && heightH2 >= heightH3 ? true : false;
        boolean lessThan = heightH1 <= heightH2 && heightH2 <= heightH3 ? true : false;

        //XOR Function
        //I/P   A   B   O/P
        //      0   0   0       false
        //      0   1   1       true
        //      1   0   1       true
        //      1   1   0       false
        //We need the output of the two conditions true XOR true and
        // false XOR false output as true;
        System.out.println(greaterThan || lessThan);
    }
}