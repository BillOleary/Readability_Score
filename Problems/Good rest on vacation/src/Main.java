import java.util.Scanner;

class Main {
    static Scanner readIn = new Scanner(System.in);

    public static void main(String[] args) {

        // put your code here
        int duration = readIn.nextInt();

//        int foodCostTotal = duration * readIn.nextInt();
//        int costOfFlight = 2 * readIn.nextInt();    //Flight for both ways
//        int hotelCostTotal = (duration - 1) * readIn.nextInt();
//
//        System.out.println(foodCostTotal + costOfFlight + hotelCostTotal);
        System.out.println(totalCost(duration));

    }

    //using a recursive method
    public static int totalCost(int value) {
        int sum = 0;
        if (!readIn.hasNext()) {
            return 0;
        }
        else {
            sum += readIn.nextInt();
        }
        return sum;
    }

}