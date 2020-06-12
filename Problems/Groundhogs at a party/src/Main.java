import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int cupCake = readIn.nextInt();
        boolean isWeekend = readIn.nextBoolean();

        System.out.println(isWeekend && cupCake >= 15 && cupCake <= 25 ?
                            true : !isWeekend && cupCake >= 10 && cupCake <= 20 ?
                            true : false);
    }
}