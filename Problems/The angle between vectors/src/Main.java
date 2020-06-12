import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner readIn = new Scanner(System.in);
        int vectorAx = readIn.nextInt();
        int vectorAy = readIn.nextInt();

        int vectorBx = readIn.nextInt();
        int vectorBy = readIn.nextInt();

        double magVectorA = Math.sqrt(vectorAx * vectorAx + vectorAy * vectorAy);
        double magVectorB =  Math.sqrt(vectorBx * vectorBx + vectorBy * vectorBy);

        double dotProductVectorAB = vectorAx * vectorBx + vectorAy * vectorBy;

        double angle = Math.acos(dotProductVectorAB / (magVectorA * magVectorB));

        System.out.println((int) (angle * 180 / Math.PI));
    }
}