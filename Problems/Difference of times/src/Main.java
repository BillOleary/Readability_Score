
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        int difference = 0;
        // put your code here
        int[] times = readIn.tokens().mapToInt(Integer::parseInt).toArray();

        for (int index = times.length; index >= times.length / 2; index -= 3) {
            difference = toSeconds(times[index - 3], times[index - 2], times[index - 1]) - difference;
        }

        System.out.println(Math.abs(difference));

    }

    private static int toSeconds(int hours, int minutes, int seconds) {
        return 3600 * hours + 60 * minutes + seconds;
    }
}