import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int heightPole = scanner.nextInt();
        int dayTimeCrawl = scanner.nextInt();
        int nightTimeSlide = scanner.nextInt();

        int dayAtHeight = (int) Math.ceil((double) (heightPole - nightTimeSlide) / (dayTimeCrawl - nightTimeSlide));



        System.out.println(dayAtHeight);

    }
}